(defproject double_booked "0.5.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-time "0.14.4"]
                 [org.clojure/core.match "0.3.0-alpha5"]]
  :main ^:skip-aot double-booked.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
