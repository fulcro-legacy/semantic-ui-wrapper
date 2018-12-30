(defproject fulcrologic/semantic-ui-react-wrappers "2.0.5-SNAPSHOT"
  :description "Semantic UI React Wrappers"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :url "https://github.com/fulcrologic/semantic-ui-wrapper"
  :min-lein-version "2.7.0"

  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [org.clojure/data.json "0.2.6"]
                 [thheller/shadow-cljs "2.7.3"]
                 ; [org.clojure/clojurescript "1.10.439" :scope "provided"]
                 [fulcrologic/fulcro "2.6.18" :scope "provided"]
                 [cljsjs/semantic-ui-react "0.84.0-0"]
                 [nubank/workspaces "1.0.2"]
                 ]

  :source-paths ["src/main"]
  :clean-targets ^{:protect false} ["target" "resources/public/js"]
  :jar-exclusions [#"public/.*"]

  :profiles {:jar {}
             ; :dev {:source-paths ["src/main" "src/cards"]
             ;       :jvm-opts     ["-XX:-OmitStackTraceInFastThrow"]
             ;       :figwheel     {:css-dirs        ["resources/public/css"]
             ;                      :validate-config false}
             ;       ; :cljsbuild    {:builds
             ;       ;                [{:id           "cards"
             ;       ;                  :figwheel     {:devcards true}
             ;       ;                  :source-paths ["src/main" "src/cards"]
             ;       ;                  :compiler     {:asset-path           "js/cards"
             ;       ;                                 :main                 fulcrologic.cards
             ;       ;                                 :output-dir           "resources/public/js/cards"
             ;       ;                                 :output-to            "resources/public/js/cards.js"
             ;       ;                                 :preloads             [devtools.preload]
             ;       ;                                 :source-map-timestamp true
             ;       ;                                 :foreign-libs [{ :file           "node_modules/semantic-ui-react/dist/umd/semantic-ui-react.min.js"
             ;       ;                                                :provides       ["semantic-ui-react"]   
             ;       ;                                                :global-exports {semantic-ui-react SemanticUIReact}}
             ;       ;                                                 ]
             ;       ;                                 }}]} 

             ;       :dependencies [[binaryage/devtools "0.9.10"]
             ;                      [org.clojure/tools.namespace "0.3.0-alpha4"]
             ;                      [org.clojure/tools.nrepl "0.2.13"]
             ;                      [cider/piggieback "0.3.10"]
             ;                      ; [figwheel-sidecar "0.5.17"]
             ;                      ; [devcards "0.2.5"]
             ;                      ]}
             

             ; {:uberjar    {:main           flexitradie.server-main
             ;              :aot            :all
             ;              :jar-exclusions [#"public/js/test" #"public/js/workspaces" #"public/workspaces.html"]
             ;              :prep-tasks     ["clean" ["clean"]
             ;                               "compile" ["with-profile" "cljs" "run" "-m" "shadow.cljs.devtools.cli" "release" "main"]]}
             ; :production {}
             :cljs       {:source-paths ["src/main" "src/test" "src/workspaces"]
                          :dependencies [[binaryage/devtools "0.9.10"]
                                         [org.clojure/clojurescript "1.10.439"]
                                         [fulcrologic/fulcro-inspect "2.2.4"]]}
             :dev        {:source-paths ["src/main" "src/dev" "src/workspaces"]
                          :jvm-opts     ["-XX:-OmitStackTraceInFastThrow" "-Xmx1g"]

                          :plugins      [[com.jakemccrary/lein-test-refresh "0.23.0"]]

                          :dependencies [[org.clojure/tools.namespace "0.3.0-alpha4"]
                                         [org.clojure/tools.nrepl "0.2.13"]
                                         [cider/piggieback "0.3.10"]]
                          :repl-options {:init-ns          user
                                         :nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}}
  
  )
