(ns generative-episodic-story-embryo.core
  (:gen-class)
  (:require [generative-episodic-story-embryo.pure-random :as pure-random]
            [generative-episodic-story-embryo.data :as data]
            [generative-episodic-story-embryo.story-embryo :as embryo]
            [generative-episodic-story-embryo.planner :as planner]
            [datascript.core :as d]))

(def story-file "story.txt")

(defn print-story [s]
  (println (str (count (clojure.string/split s #"\s+")) " words"))
  (spit story-file s))

(defn gen-repeating-string-story [world-state]
  (->> data/default-world-state
    (repeat)
    (take 1500)
    (map embryo/gen-episode)
    (map #(clojure.string/join "\n" (:current-ep %)))   
    (clojure.string/join "\n\n\n")))



(defn -main
  "Kicks everything off"
  [& args]
  (println "Generating a \"Hello world\" novel")
  (->> 
    data/default-world-state
    (gen-repeating-string-story)
    (print-story)))
