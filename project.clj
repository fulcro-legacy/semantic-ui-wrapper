(defproject fulcrologic/semantic-ui-react-wrappers "2.0.0-beta1"
  :description "Semantic UI React Wrappers"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :url "https://github.com/fulcrologic/semantic-ui-wrapper"
  :min-lein-version "2.7.0"

  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [org.clojure/clojurescript "1.10.238" :scope "provided"]
                 [cljsjs/semantic-ui-react "0.78.2-0"]]

  :source-paths ["src/main"]
  :clean-targets ^{:protect false} ["target" "resources/public/js"]
  :jar-exclusions [#"public/.*"]

  :profiles {:jar {}
             :dev {:source-paths ["src/main" "src/cards"]
                   :jvm-opts     ["-XX:-OmitStackTraceInFastThrow"]
                   :figwheel     {:css-dirs        ["resources/public/css"]
                                  :validate-config false}
                   :cljsbuild    {:builds
                                  [{:id           "cards"
                                    :figwheel     {:devcards true}
                                    :source-paths ["src/main" "src/cards"]
                                    :compiler     {:asset-path           "js/cards"
                                                   :main                 fulcrologic.cards
                                                   :output-dir           "resources/public/js/cards"
                                                   :output-to            "resources/public/js/cards.js"
                                                   :preloads             [devtools.preload]
                                                   :source-map-timestamp true}}]}

                   :dependencies [[binaryage/devtools "0.9.9"]
                                  [org.clojure/tools.namespace "0.3.0-alpha4"]
                                  [figwheel-sidecar "0.5.15"]
                                  [devcards "0.2.4"]]}})
