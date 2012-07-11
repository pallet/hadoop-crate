(defproject org.cloudhoist/hadoop-crate "0.7.0-SNAPSHOT"
  :description "A Pallet crate to install Hadoop"
  :url "http://github.com/pallet/hadoop-crate"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.cloudhoist/java "0.5.1"]
                 [org.cloudhoist/ssh-key "0.5.1"]
                 [org.cloudhoist/pallet "0.6.8"]]
  :profiles {:dev
             {:dependencies
              [[org.cloudhoist/pallet "0.6.8" :classifier "tests"]]}})
