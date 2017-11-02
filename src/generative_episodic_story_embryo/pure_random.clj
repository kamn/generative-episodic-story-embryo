(ns generative-episodic-story-embryo.pure-random
  (:require [xoroshiro128.core :as x]))

(defn generate-seed [seed]
  (x/xoroshiro128+ seed)) 


(defn get-value [seed]
  [(x/value seed) (x/next seed)])