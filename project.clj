(defproject fulcrologic/semantic-ui-react-wrappers "1.0.0-SNAPSHOT"
  :description "Semantic UI React Wrappers"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :min-lein-version "2.7.0"

  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.clojure/clojurescript "1.9.946" :scope "provided"]
                 [fulcrologic/fulcro-spec "1.0.0-beta9" :scope "test"]
                 [cljsjs/semantic-ui-react "0.73.0-0" :scope "provided"]]

  :source-paths ["src/main"]
  :test-paths ["src/test"]
  :clean-targets ^{:protect false} ["target" "resources/public/js"]
  :jar-exclusions [#"public/.*"]
  :test-refresh {:report       fulcro-spec.reporters.terminal/fulcro-report
                 :changes-only false
                 :with-repl    true}

  :profiles {:jar {}
             :dev {:source-paths ["src/main" "src/cards"]
                   :jvm-opts     ["-XX:-OmitStackTraceInFastThrow" "-client" "-XX:+TieredCompilation" "-XX:TieredStopAtLevel=1"
                                  "-Xmx1g" "-XX:+UseConcMarkSweepGC" "-XX:+CMSClassUnloadingEnabled" "-Xverify:none"]
                   :figwheel     {:css-dirs        ["resources/public/css"]
                                  :validate-config false}
                   :cljsbuild    {:builds
                                  [{:id           "cards"
                                    :figwheel     {:devcards true}
                                    :source-paths ["src/main" "src/cards"]
                                    :compiler     {:asset-path           "js/cards"
                                                   :main                 fulcrologic.cards
                                                   :optimizations        :none
                                                   :output-dir           "resources/public/js/cards"
                                                   :output-to            "resources/public/js/cards.js"
                                                   :preloads             [devtools.preload]
                                                   :source-map-timestamp true}}]}

                   :plugins      [[com.jakemccrary/lein-test-refresh "0.19.0"]]
                   :dependencies [[binaryage/devtools "0.9.4"]
                                  [org.clojure/tools.namespace "0.3.0-alpha4"]
                                  [figwheel-sidecar "0.5.13"]
                                  [devcards "0.2.3"]]}})
