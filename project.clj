(defproject double_booked "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins  [[cider/cider-nrepl "0.15.1"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-time "0.14.4"]
                 [org.clojure/core.match "0.3.0-alpha5"]
                 [org.clojure/tools.nrepl "0.2.12"]
                 [cljfmt "0.5.7"]]
  :main ^:skip-aot double-booked.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
