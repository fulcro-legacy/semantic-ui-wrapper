(defproject fulcrologic/semantic-ui-react-wrappers-root "2.0.5-SNAPSHOT" 
  :plugins [[lein-modules "0.3.11"]]

  :description "Semantic UI React Wrappers"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :url "https://github.com/fulcrologic/semantic-ui-wrapper"
  :min-lein-version "2.7.0"

  :dependencies [[org.clojure/clojure "_" :scope "provided"]
                 [fulcrologic/fulcro "_" :scope "provided"]]

  :profiles {:dev {:source-paths ["src/dev"]
                   :jvm-opts     ["-XX:-OmitStackTraceInFastThrow"]
                   :dependencies [[binaryage/devtools "0.9.10"]
                                  [org.clojure/data.json "0.2.6"]]}}
  
  :modules {:versions {org.clojure/clojure "1.9.0"
                       fulcrologic/fulcro  "2.8.0-SNAPSHOT"}})

