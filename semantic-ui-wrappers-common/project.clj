(defproject fulcrologic/semantic-ui-react-wrappers-common "2.0.5-SNAPSHOT" 
  :plugins [[lein-modules "0.3.11"]]

  :description "Semantic UI React Wrappers - Common components"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :url "https://github.com/fulcrologic/semantic-ui-wrapper"
  :min-lein-version "2.7.0"

  :dependencies [[org.clojure/clojure "_" :scope "provided"]
                 [fulcrologic/fulcro "_" :scope "provided"]]

  :source-paths ["src/main"]
  :clean-targets ^{:protect false} ["target" "resources/public/js"]
  :jar-exclusions [#"public/.*"]

  :profiles {:jar {}
             :dev {:source-paths ["src/main"]
                   :jvm-opts     ["-XX:-OmitStackTraceInFastThrow"]
                   :dependencies [[binaryage/devtools "0.9.10"]
                                  [org.clojure/clojurescript "1.10.439"]
                                  [org.clojure/tools.namespace "0.3.0-alpha4"]]}})

