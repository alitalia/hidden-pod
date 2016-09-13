(defproject hidden-pod "0.1.0-SNAPSHOT"
  :description "Static hidden services with no effort"
  :url "https://github.com/edne/hidden-pod"
  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :resource-paths ["resources/jtorctl-briar.jar"]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [juxt/dirwatch "0.2.3"]
                 [me.raynes/conch "0.8.0"]
                 [ring "1.5.0"]]

  :main ^:skip-aot hidden-pod.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
