(defproject generative-episodic-story-embryo "0.0.1"
  :description "A story generator for NaNoGenMo 2017"
  :url "https://github.com/kamn/generative-episodic-story-embryo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot generative-episodic-story-embryo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
