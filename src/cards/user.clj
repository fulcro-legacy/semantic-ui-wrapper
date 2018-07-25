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
  (:require
    cljsjs.semantic-ui-react
    goog.object
    [fulcro.client.dom :as dom]))

(defn factory-apply
  [class]
  (fn [props & children]
    (apply js/React.createElement
      class
      (clj->js props)
      children)))

(defn wrapped-factory-apply
  \"Returns a factory that wraps the given class as an input. Requires that the target item support `:value` as a prop.\"
  [class]
  (let [factory (dom/wrap-form-element class)]
    (fn [props] (factory (clj->js props)))))

(def semantic-ui js/semanticUIReact)

(defn get-sui
  ([cls]
   (goog.object/get semantic-ui cls)))

(defn sui-factory
  [cls] (factory-apply (get-sui cls)))

(defn sui-input-factory
  [cls]
  (wrapped-factory-apply (get-sui cls)))

")

(defn hyphenated [camelCase]
  (-> camelCase
    (str/replace #"([A-Z])" "-$1")
    (str/lower-case)
    (str/replace #"^-" "")))

(defn gen-docstring [doc-data]
  (let [description  (get-in doc-data [:docblock :description])
        description  (if (seq description) (str/join "\n  " description))
        props        (sort-by :name (get doc-data :props))
        docs-by-name (map (fn [{:keys [type description name value]}]
                            (let [n (count value)]
                              (cond-> (str name " (" type "): " (first description))
                                value (str " (" (str/join ", " (take 100 value)) (when (> n 100) " ...") ")")))) props)]
    (str description "\n\n  Props:\n    - " (str/join "\n    - " docs-by-name))))

(defn quoted [s] (str "\"" s "\""))
(defn escaped [s] (str/replace s "\"" "\\\""))

(def input-factory-classes
  #{"Dropdown"
    "DropdownSearchInput"
    "Input"
    "Search"
    "TextArea"})

(defn factory [class]
  (if (contains? input-factory-classes class)
    "sui-input-factory"
    "sui-factory"))

(defn gen-factory [doc-data]
  (let [class        (:displayName doc-data)
        factory-name (str "ui-" (hyphenated class))
        factory      (factory class)]
    (str "(def " factory-name "\n"
      "  \""
      (escaped (gen-docstring doc-data))
      "\""
      "\n  "
      (str "(" factory " " (quoted class) "))\n"))))

(defn read-info [dir filename]
  (with-open [r (clojure.java.io/reader (clojure.java.io/as-file (str dir "/" filename)))]
    (clojure.data.json/read r :key-fn keyword)))

(defn gen-factories [component-dir]
  (let [factories (->> (seq (.list (clojure.java.io/file component-dir)))
                       (map #(read-info component-dir %))
                       (map gen-factory))]
    (str preamble
      (str/join "\n" factories))))

(comment
  ;; Generate CLJS file:
  ;; 1. copy the componentInfo folder from semantic-ui-react/docs/src/ once you've built the docs there (yarn build:docs)
  ;; 2. This:
  (spit (clojure.java.io/as-file "src/main/fulcrologic/semantic_ui/factories.cljs") (gen-factories "componentInfo")))


