(ns generative-episodic-story-embryo.pure-random
  (:require [xoroshiro128.core :as x]))

(defn generate-seed [seed]
  (x/xoroshiro128+ seed)) 

(defn get-value [seed]
  [(x/value seed) (x/next seed)])


(defn get-upto [max seed]
  (let [raw-val (x/value seed)
        val (mod raw-val max)]
    [val (x/next seed)]))  

(defn get-range [min max seed])