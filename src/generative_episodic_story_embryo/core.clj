(ns generative-episodic-story-embryo.core
  (:gen-class)
  (:require [generative-episodic-story-embryo.pure-random :as pure-random]))

(def story-file "story.txt")

(defn print-story [str]
  (spit story-file str)) 

(defn gen-repeating-string-story [str]
  (->> str
    (repeat)
    (take 50000)
    (clojure.string/join "\n")))

(defn -main
  "Kicks everything off"
  [& args]
  (println "Generating a \"Hello world\" novel")
  (->> 
    "Hello World!"
    (gen-repeating-string-story)
    (print-story)))
