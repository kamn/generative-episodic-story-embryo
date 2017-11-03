(defproject generative-episodic-story-embryo "0.1.0"
  :description "A story generator for NaNoGenMo 2017"
  :url "https://github.com/kamn/generative-episodic-story-embryo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [janiczek/markov "0.3.1"]
                 [selmer "1.10.0"]
                 [xoroshiro128 "1.0.1"]]
  :main ^:skip-aot generative-episodic-story-embryo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
