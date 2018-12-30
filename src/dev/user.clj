(ns user
  (:require
    [com.stuartsierra.component :as component]
    [clojure.string :as str]
    [clojure.tools.namespace.repl :refer [set-refresh-dirs]]
    [clojure.data.json :as json]
    ; [figwheel-sidecar.system :as fig]
    ))

(set-refresh-dirs "src/main" "src/test" "src/cards" "src/workspaces")

;FIGWHEEL
; (def figwheel (atom nil))

; ; Usable from a REPL to start one-or-more figwheel builds. Support -Dbuild-name and -Dfigwheel.port so that you can
; ; run any specific build(s) on a custom port from an IntelliJ Run Configuration. This is helpful when you want
; ; to run multiple builds, but want fast hot reload (place each build on a separate figwheel instance running on
; ; a custom port. E.g. in JVM Args: `-Dcards -Dfigwheel.port=5000` with parameters `script/figwheel.clj`.
; (defn start-figwheel
;   "Start Figwheel on the given builds, or defaults to build-ids in `figwheel-config`."
;   ([]
;    (let [figwheel-config (fig/fetch-config)
;          props           (System/getProperties)
;          all-builds      (->> figwheel-config :data :all-builds (mapv :id))]
;      (start-figwheel (keys (select-keys props all-builds)))))
;   ([build-ids]
;    (let [figwheel-config   (fig/fetch-config)
;          port              (some-> (System/getProperty "figwheel.port") Integer/parseInt)
;          default-build-ids (-> figwheel-config :data :build-ids)
;          build-ids         (if (empty? build-ids) default-build-ids build-ids)
;          preferred-config  (cond-> (assoc-in figwheel-config [:data :build-ids] build-ids)
;                              (and port (pos? port)) (assoc-in [:data :figwheel-options :server-port] port))]
;      (reset! figwheel (component/system-map
;                         :css-watcher (fig/css-watcher {:watch-paths ["resources/public/css"]})
;                         :figwheel-system (fig/figwheel-system preferred-config)))
;      (println "STARTING FIGWHEEL ON BUILDS: " build-ids)
;      (swap! figwheel component/start)
;      (fig/cljs-repl (:figwheel-system @figwheel)))))

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
  #{"Input"
    "Search"
    "TextArea"})

(defn factory [class]
  (if (contains? input-factory-classes class)
    "sui-input-factory"
    "sui-factory"))

(defn factory-helper [class]
  (if (contains? input-factory-classes class)
    "wrapped-factory-apply"
    "factory-apply"))

(defn factory-helper-function [class factory-name docstring]
  (str "(def " factory-name "\n"
       "  \""
       (escaped docstring)
       "\""
       "\n  "
       " (h/"  (factory-helper class) " " class "))"))

(defn factory-function [ns factory-name docstring]
  (str "(def " factory-name "\n"
       "  \""
       (escaped docstring)
       "\""
       "\n"
       "  " ns "/" factory-name ")"))

(defn parent-ns [class factory-name docstring children]
  (let [class-references  (str/join " " (cons class (mapv :class children)))
        child-factory-fns (mapv (fn [{:keys [class factory-name docstring]}] (factory-helper-function class factory-name docstring)) children)
        factory-fns       (cons (factory-helper-function class factory-name docstring) 
                                child-factory-fns)]
  (str "(ns fulcrologic.semantic-ui.modules." factory-name "\n"
       "  (:require\n" 
       ; "    [fulcro.client.dom :as dom]\n"
       "    [fulcrologic.semantic-ui.factory-helpers :as h]\n"
       "    [\"semantic-ui-react\" :refer [" class-references  "]""]))\n\n"
       (str/join "\n\n" factory-fns))))

(defn gen-factory-map [class doc-data]
  (let [factory-name (str "ui-" (hyphenated class))
        docstring    (gen-docstring doc-data)]
    {:class        class
     :factory-name factory-name 
     :docstring    docstring
     :props        (:props doc-data)}))

(defn gen-module-map [coll doc-data]
  (let [class         (:displayName doc-data)
        parent?       (:isParent doc-data)
        parent-class  (:parentDisplayName doc-data)]
    (if parent?
      (update-in coll [class] merge (gen-factory-map class doc-data))
      (update-in coll [parent-class :children] #(let [c (gen-factory-map class doc-data)] 
                                                  (if (not %) 
                                                    [c] 
                                                    (conj % c)))))))

(defn factories-ns [modules]
  (let [module-requires (str/join "\n" 
                                  (mapv (fn [[_ {:keys [factory-name]}]] 
                                          (str "[fulcrologic.semantic-ui.modules." factory-name " :as " factory-name "]")) 
                                        (sort-by (fn [[_ {:keys [factory-name]}]] factory-name) modules)))
        factories       (str/join "\n\n"
                                  (mapv (fn [[_ {:keys [class factory-name docstring children]}]] 
                                          (let [parent-factory-name factory-name]
                                          (str/join "\n\n"
                                          (cons (factory-function parent-factory-name factory-name docstring)
                                                (mapv (fn [{:keys [class factory-name docstring]}]
                                                        (factory-function parent-factory-name factory-name docstring))
                                                      (sort-by :factory-name children )
                                                  )
                                                )))
                                          ) 
                                        (sort-by (fn [[_ {:keys [factory-name]}]] factory-name) modules)))]
    (str "(ns fulcrologic.semantic-ui.factories\n"
         "  (:require " module-requires " ))\n\n"
         factories)))

(defn read-info [dir filename]
  (with-open [r (clojure.java.io/reader (clojure.java.io/as-file (str dir "/" filename)))]
    (json/read r :key-fn keyword)))

(defn icons-ns [icon-names]
  (let [icons (str/join "\n"
                        (mapv (fn [[symbol css-class]] 
                                (str  "(def " symbol " \"" css-class "\")"))
                              (->> icon-names 
                                   (map #(let [symbol    (-> %
                                                             (str/replace #" " "-") 
                                                             (str/replace #"^(\d+.*)" "_$1")
                                                             (str "-icon"))
                                               css-class (-> %
                                                             (str/replace #"-" " "))]
                                           [symbol css-class])) 
                                   sort 
                                   distinct)))]
    (str "(ns fulcrologic.semantic-ui.icons)\n\n" icons)))

(defn gen-modules [component-dir]
  (let [modules (->> (seq (.list (clojure.java.io/file component-dir)))
                     (map #(read-info component-dir %))
                     (reduce gen-module-map {}))]
    (doseq [[class {:keys [class factory-name docstring children props]}] modules]
      (spit (clojure.java.io/as-file (str "src/main/fulcrologic/semantic_ui/modules/" (str/replace factory-name  #"-" "_") ".cljs")) (parent-ns class factory-name docstring children) )
      (if (= class "Icon")
        (spit (clojure.java.io/as-file "src/main/fulcrologic/semantic_ui/icons.cljs") (icons-ns (->> props (filter #(= (:name %) "name")) first :value)))))
    (spit (clojure.java.io/as-file "src/main/fulcrologic/semantic_ui/factories.cljs") (factories-ns modules))))

(defn gen-factories [component-dir]
  "Deprecated - use gem-modules"
  (gen-modules component-dir))

(comment
  ;; clone semantic-ui-react:
  ;; git clone https://github.com/Semantic-Org/Semantic-UI-React
  ;; in the cloned repo:
  ;; yarn install
  ;; yarn build:docs 
  ;; then using the path to the docs/src/componentInfo folder, start a repl and run 
  ;; 
  ;; (gen-modules path/to/generated/componentInfo) 
  )

