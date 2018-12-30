(defproject fulcrologic/semantic-ui-react-wrappers "2.0.5-SNAPSHOT" 
  :plugins [[lein-modules "0.3.11"]]

  :description "Semantic UI React Wrappers"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :url "https://github.com/fulcrologic/semantic-ui-wrapper"
  :min-lein-version "2.7.0"

  :dependencies [[org.clojure/clojure "_" :scope "provided"]
                 [fulcrologic/fulcro "_" :scope "provided"]
                 [fulcrologic/semantic-ui-react-wrappers-common :version]
                 [cljsjs/semantic-ui-react "0.84.0-0"]]

  :source-paths ["src/main"]
  :clean-targets ^{:protect false} ["target" "resources/public/js"]
  :jar-exclusions [#"public/.*"]

  :profiles {:jar {}
             :dev {:source-paths ["src/main" "src/cards" "src/dev"]
                   :jvm-opts     ["-XX:-OmitStackTraceInFastThrow"]
                   :figwheel     {:css-dirs        ["resources/public/css"]
                                  :validate-config false}
                   :cljsbuild    {:builds
                                  [{:id           "cards"
                                    :figwheel     {:devcards true}
                                    :source-paths ["src/main" "src/cards"]
                                    :compiler     {:asset-path           "js/cards"
                                                   :main                 fulcrologic.semantic-ui.cards
                                                   :output-dir           "resources/public/js/cards"
                                                   :output-to            "resources/public/js/cards.js"
                                                   :preloads             [devtools.preload]
                                                   :source-map-timestamp true}}]}
                   :dependencies [[binaryage/devtools "0.9.10"]
                                  [org.clojure/clojurescript "1.10.439"]
                                  [org.clojure/tools.namespace "0.3.0-alpha4"]
                                  [figwheel-sidecar "0.5.17"]
                                  [devcards "0.2.5"]]}})
