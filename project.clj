(defproject org.cloudhoist/hadoop "0.7.0-alpha.3-SNAPSHOT"
  :description "A Pallet crate to install Hadoop"
  :url "http://github.com/pallet/hadoop-crate"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :repositories {"sonatype" "https://oss.sonatype.org/content/repositories/releases/"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.cloudhoist/java "0.5.1"]
                 [org.cloudhoist/ssh-key "0.5.1"]
                 [org.cloudhoist/pallet "0.7.0"]
                 [slingshot "0.10.3"]
                 ;; TODO: find a more official alternative to this
                 ;; build of prxml.
                 [prxml "1.3.0"]]
  :profiles {:dev
             {:dependencies
              [[org.cloudhoist/pallet "0.7.0" :classifier "tests"]]}})
