(ns user
  (:require
    [com.stuartsierra.component :as component]
    [clojure.string :as str]
    [figwheel-sidecar.system :as fig]))

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
  (:require
    cljsjs.semantic-ui-react
    goog.object))

(defn factory-apply
  [class]
  (fn [props & children]
    (apply js/React.createElement
      class
      props
      children)))

(def semantic-ui js/semanticUIReact)

(defn get-sui
  ([cls]
   (goog.object/get semantic-ui cls))
  ([cls member]
   (goog.object/getValueByKeys semantic-ui cls member)))

(defn sui-factory
  ([cls] (factory-apply (get-sui cls)))
  ([cls member] (factory-apply (get-sui cls member))))

  ")

(defn hyphenated [camelCase]
  (-> camelCase
    (str/replace #"([A-Z])" "-$1")
    (str/lower-case)
    (str/replace #"^-" "")))

(defn factory-class-and-subclass [s]
  (let [[cls subclass] (-> s
                         (str/replace #"^src/[^/]*/" "")
                         (str/replace #".js$" "")
                         (str/split #"/"))
        name (str/replace subclass cls "")]
    [cls name]))

(defn function-name [s]
  (let [[cls subclass] (factory-class-and-subclass s)]
    (if (= cls subclass)
      (hyphenated cls)
      (hyphenated (str cls subclass)))))

(defn gen-docstring [doc-data k]
  (let [entry        (get doc-data k)
        description  (->> entry :docBlock :description (str/join "\n"))
        props        (sort-by :name (:props entry))
        docs-by-name (map (fn [{:keys [type description name value]}]
                            (cond-> (str name " (" type "): " (first description))
                              value (str " (" value ")"))) props)]
    (str description "\n\nProps:\n  - " (str/join "\n  - " docs-by-name))))

(defn quoted [s] (str "\"" s "\""))
(defn escaped [s] (str/replace s "\"" "\\\""))

(defn gen-factories [docgenInfo-json-filename]
  (let [doc-data           (with-open [r (clojure.java.io/reader (clojure.java.io/as-file docgenInfo-json-filename))]
                             (->> r clojure.data.json/read))
        doc-data           (clojure.walk/keywordize-keys (into {} (map (fn [[k v]] [(function-name k) (assoc v :csc (factory-class-and-subclass k))]) doc-data)))
        ks                 (keys doc-data)
        doc-strings-by-key (into (sorted-map) (map (fn [k] [k (gen-docstring doc-data k)])
                                                ks))
        factories          (map (fn [k]
                                  (let [[cls subclass] (-> doc-data k :csc)]
                                    (str "(def ui-" (name k) "\n"
                                      (quoted (escaped (get doc-strings-by-key k)))
                                      "\n  "
                                      (if (or (= cls subclass) (= "" subclass))
                                        (str "(sui-factory " (quoted cls) "))\n")
                                        (str "(sui-factory " (quoted cls) " " (quoted subclass) "))\n"))))) ks)]
    (str preamble
      (str/join "\n" factories))))

(comment
  (spit (clojure.java.io/as-file "src/main/fulcrologic/semantic_ui/factories.cljs") (gen-factories "docgenInfo.json"))

  )
