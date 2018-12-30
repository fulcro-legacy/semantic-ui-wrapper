(defproject fulcrologic/semantic-ui-react-wrappers-shadow "2.0.5-SNAPSHOT" 
  :plugins [[lein-modules "0.3.11"]]

  :description "Semantic UI React Wrappers - Optimised for shadow-cljs"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :url "https://github.com/fulcrologic/semantic-ui-wrapper"
  :min-lein-version "2.7.0"

  :dependencies [[org.clojure/clojure "_" :scope "provided"]
                 [fulcrologic/fulcro "_" :scope "provided"]
                 [fulcrologic/semantic-ui-react-wrappers-common :version]]

  :source-paths ["src/main"]
  :clean-targets ^{:protect false} ["target" "resources/public/js"]
  :jar-exclusions [#"public/.*"]

  :profiles {:jar {}
             :dev {:source-paths ["src/main" "src/workspaces" "src/dev"]
                   :jvm-opts     ["-XX:-OmitStackTraceInFastThrow"]
                   :dependencies [[thheller/shadow-cljs "2.7.15"]
                                  [org.clojure/tools.namespace "0.3.0-alpha4"]
                                  [org.clojure/tools.nrepl "0.2.13"]
                                  [nubank/workspaces "1.0.2"]
                                  [cider/piggieback "0.3.10"]]
                   :repl-options {:init-ns          user
                                  :nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}})
