(ns user
  (:require
    [clojure.string :as str]
    [clojure.data.json :as json]
    [clojure.java.io :refer [as-file file make-parents reader]]))

(def factories-preamble
  "(ns fulcrologic.semantic-ui.factories
   (:require
     cljsjs.semantic-ui-react
     goog.object
     [com.fulcrologic.fulcro.dom :as dom]
     [com.fulcrologic.semantic-ui.factory-helpers :as h]))

 (defn factory-apply
   \"DEPRECATED: Use fulcrologic.semantic-ui.factory-helpers/factory-apply instead\"
   [class]
   (h/factory-apply class))

 (defn wrapped-factory-apply
   \"DEPRECATED: Use com.fulcrologic.semantic-ui.factory-helpers/wrapped-factory-apply instead\"
   [class]
   (h/wrapped-factory-apply class))

 (def semantic-ui js/semanticUIReact)

 (defn get-sui
   ([cls]
    (goog.object/get semantic-ui cls)))

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
  #{"Input"
    "Checkbox"
    "FormInput"
    "DropdownSearchInput"
    "Search"
    "TextArea"})

(defn factory-helper [class]
  (if (contains? input-factory-classes class)
    "wrapped-factory-apply"
    "factory-apply"))

(defn factory-helper-function
  ([{:keys [class factory-name docstring]}]
   (factory-helper-function class factory-name docstring true))
  ([class factory-name docstring]
   (factory-helper-function class factory-name docstring false))
  ([class factory-name docstring get-as-string]
   (let [class-to-get (if get-as-string
                        (str "(get-sui \"" class "\")")
                        class)]
     (str "(def " factory-name "\n"
       "  \""
       (escaped docstring)
       "\""
       "\n  "
       " (h/" (factory-helper class) " " class-to-get "))\n"))))

(defn factory-ns-shadow [ns class factory-name include-file docstring filename]
  (str "(ns " ns "\n"
    "  (:require\n"
    "    [fulcrologic.semantic-ui.factory-helpers :as h]\n"
    "    [\"" include-file "\" :default " class "]))\n\n"
    "  " (factory-helper-function class factory-name docstring)))

(defn gen-factory-map [out-path]
  (fn [doc-data]
    (let [{:keys [displayName props type repoPath]} doc-data
          class        displayName
          factory-name (str "ui-" (hyphenated class))
          tree         (-> repoPath str/lower-case (str/split #"/"))
          treeparts    (subvec tree 1 (- (count tree) 1))
          filename     (str out-path "/" (str/join "/" treeparts) "/" (str/replace factory-name #"-" "_") ".cljs")
          nns          (str "fulcrologic.semantic-ui" "." (str/join "." treeparts) "." factory-name)
          docstring    (gen-docstring doc-data)]
      {:class        class
       :factory-name factory-name
       :include-file (-> repoPath (str/replace #"src" "semantic-ui-react/dist/commonjs")
                       (str/replace #"\.js" ""))
       :filename     filename
       :ns           nns
       :docstring    docstring
       :props        props})))

(defn read-info [dir filename]
  (with-open [r (reader (as-file (str dir "/" filename)))]
    (json/read r :key-fn keyword)))

(defn icons-ns [icon-names]
  (let [icons (str/join "\n"
                (mapv (fn [[symbol css-class]]
                        (str "(def " symbol " \"" css-class "\")"))
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

(defn gen-cljs-factories [modules]
  (str factories-preamble (str/join "\n" (map factory-helper-function modules))))

(defn gen-factories [component-dir]
  (let [modules (->> (seq (.list (file component-dir)))
                  (map #(read-info component-dir %))
                  (map (gen-factory-map "semantic-ui-wrappers-shadow/src/main/fulcrologic/semantic_ui/"))
                  (sort-by :factory-name))]
    (make-parents "semantic-ui-wrappers/src/main/fulcrologic/semantic_ui/factories.cljs")
    (spit (as-file "semantic-ui-wrappers/src/main/fulcrologic/semantic_ui/factories.cljs") (gen-cljs-factories modules))
    (doseq [{:keys [filename ns class factory-name include-file filename docstring props] :as m} modules]
      (make-parents filename)
      (spit (as-file filename) (factory-ns-shadow ns class factory-name include-file docstring filename))
      (if (= class "Icon")
        (spit (as-file "semantic-ui-wrappers-common/src/main/fulcrologic/semantic_ui/icons.cljs") (icons-ns (->> props (filter #(= (:name %) "name")) first :value)))))))

(comment
  ;; to generate the factories files
  ;; clone semantic-ui-react:
  ;; git clone https://github.com/Semantic-Org/Semantic-UI-React
  ;; in the cloned repo:
  ;; yarn install
  ;; yarn build:docs 
  ;; then using the path to the docs/src/componentInfo folder, start a repl and run 
  ;; 
  ;; (gen-factories path/to/generated/componentInfo) 
  )

