(ns user
  (:require
    [com.stuartsierra.component :as component]
    [clojure.string :as str]
    [clojure.tools.namespace.repl :refer [set-refresh-dirs]]
    [figwheel-sidecar.system :as fig]))

(set-refresh-dirs "src/main" "src/test" "src/cards")

;;FIGWHEEL
(def figwheel (atom nil))

; Usable from a REPL to start one-or-more figwheel builds. Support -Dbuild-name and -Dfigwheel.port so that you can
; run any specific build(s) on a custom port from an IntelliJ Run Configuration. This is helpful when you want
; to run multiple builds, but want fast hot reload (place each build on a separate figwheel instance running on
; a custom port. E.g. in JVM Args: `-Dcards -Dfigwheel.port=5000` with parameters `script/figwheel.clj`.
(defn start-figwheel
  "Start Figwheel on the given builds, or defaults to build-ids in `figwheel-config`."
  ([]
   (let [figwheel-config (fig/fetch-config)
         props           (System/getProperties)
         all-builds      (->> figwheel-config :data :all-builds (mapv :id))]
     (start-figwheel (keys (select-keys props all-builds)))))
  ([build-ids]
   (let [figwheel-config   (fig/fetch-config)
         port              (some-> (System/getProperty "figwheel.port") Integer/parseInt)
         default-build-ids (-> figwheel-config :data :build-ids)
         build-ids         (if (empty? build-ids) default-build-ids build-ids)
         preferred-config  (cond-> (assoc-in figwheel-config [:data :build-ids] build-ids)
                             (and port (pos? port)) (assoc-in [:data :figwheel-options :server-port] port))]
     (reset! figwheel (component/system-map
                        :css-watcher (fig/css-watcher {:watch-paths ["resources/public/css"]})
                        :figwheel-system (fig/figwheel-system preferred-config)))
     (println "STARTING FIGWHEEL ON BUILDS: " build-ids)
     (swap! figwheel component/start)
     (fig/cljs-repl (:figwheel-system @figwheel)))))


(def preamble
"(ns fulcrologic.semantic-ui.factories
  #?(:cljs
     (:require
       cljsjs.semantic-ui-react
       goog.object)))

#?(:cljs
   (defn factory-apply
     [class]
     (fn [props & children]
       (apply js/React.createElement
         class
         props
         children))))

#?(:cljs
   (def semantic-ui js/semanticUIReact))

#?(:cljs
   (defn get-sui
     ([cls]
      (goog.object/get semantic-ui cls))
     ([cls member]
      (goog.object/getValueByKeys semantic-ui cls member))))

#?(:clj
   (defn sui-factory
     ([cls])
     ([cls member]))
   :cljs
   (defn sui-factory
     ([cls] (factory-apply (get-sui cls)))
     ([cls member] (factory-apply (get-sui cls member)))))

  ")

(defn hyphenated [camelCase]
  (-> camelCase
    (str/replace #"([A-Z])" "-$1")
    (str/lower-case)
    (str/replace #"^-" "")))

(defn factory-name-class-and-subclass [s]
  (let [[cls subclass] (-> s
                         (str/replace #"^src/[^/]*/" "")
                         (str/replace #".js$" "")
                         (str/split #"/"))
        name (str/replace-first subclass cls "")]
    [(hyphenated (str "ui" cls name)) cls name]))

(defn gen-docstring [doc-data k]
  (let [entry        (get doc-data k)
        description  (->> entry :docBlock :description (str/join "\n"))
        props        (sort-by :name (:props entry))
        docs-by-name (map (fn [{:keys [type description name value]}]
                            (let [n (count value)]
                              (cond-> (str name " (" type "): " (first description))
                               value (str " (" (str/join ", " (take 100 value)) (when (> n 100) " ...") ")")))) props)]
    (str description "\n\nProps:\n  - " (str/join "\n  - " docs-by-name))))

(defn quoted [s] (str "\"" s "\""))
(defn escaped [s] (str/replace s "\"" "\\\""))

(defn gen-factory [doc-data doc-strings-by-key k]
  (let [[keywordized-name cls subclass] (some-> doc-data k :csc)]
    (str "(def " (name keywordized-name) "\n"
      (some-> doc-strings-by-key (get k) escaped quoted)
      "\n  "
      (if (= "" subclass)
        (str "(sui-factory " (some-> cls quoted) "))\n")
        (str "(sui-factory " (some-> cls quoted) " " (some-> subclass quoted) "))\n")))))

(defn gen-factories [docgenInfo-json-filename]
  (let [doc-data-by-filename      (with-open [r (clojure.java.io/reader (clojure.java.io/as-file docgenInfo-json-filename))]
                                    (->> r clojure.data.json/read))
        doc-data-by-factory-nm    (clojure.walk/keywordize-keys (into {} (map (fn [[filename v]]
                                                                                [(first (factory-name-class-and-subclass filename))
                                                                                 (assoc v :csc (factory-name-class-and-subclass filename))]) doc-data-by-filename)))
        factory-names-as-keywords (keys doc-data-by-factory-nm)
        doc-strings-by-key        (into (sorted-map) (map (fn [k] [k (gen-docstring doc-data-by-factory-nm k)])
                                                       factory-names-as-keywords))
        factories                 (map (partial gen-factory doc-data-by-factory-nm doc-strings-by-key) factory-names-as-keywords)]
    ;factory-names-as-keywords
    (str preamble
      (str/join "\n" factories))))

(comment
  (function-name "src/boo/Menu/Item.js")
  (function-name "src/boo/Form/Form.js")
  (function-name "src/boo/Form/FormButton.js")
  (gen-factories "docgenInfo.json")
  (->> "docgenInfo.json" (gen-factories) (filter #(re-matches #"menu" (name %))))
  (spit (clojure.java.io/as-file "src/main/fulcrologic/semantic_ui/factories.cljc") (gen-factories "docgenInfo.json"))

  )
