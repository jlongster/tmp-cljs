(defproject csp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [org.clojure/core.async "0.1.338.0-5c5012-alpha"]]
  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]
  :cljsbuild {
              :builds [{:source-paths ["src-cljs"]
                        :compiler {:output-to "out/main.js"
                                   :output-dir "out"
                                   :optimizations :none
                                   :target :nodejs
                                   :pretty-print true}}]}
  :main csp.core
  :profiles {:uberjar {:aot :all}})
