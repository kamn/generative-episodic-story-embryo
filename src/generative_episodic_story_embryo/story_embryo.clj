(ns generative-episodic-story-embryo.story-embryo
  (:require [xoroshiro128.core :as x]
            [generative-episodic-story-embryo.data :as data]
            [selmer.parser :as selmer]))


(defn get-text [xs world-state]
  (-> xs
      (first)
      (selmer/render world-state)))

(defn append-to-ep [s world-state]
  (update world-state :current-ep conj s))

(defn gen-generic [data-list world-state]
  (let [s (get-text data-list world-state)]
    (append-to-ep s world-state)))

(def gen-you (partial gen-generic data/embryo-you)) 
(def gen-need (partial gen-generic data/embryo-need)) 
(def gen-go (partial gen-generic data/embryo-go)) 
(def gen-search (partial gen-generic data/embryo-search))
(def gen-find (partial gen-generic data/embryo-find))
(def gen-take (partial gen-generic data/embryo-take))
(def gen-return (partial gen-generic data/embryo-return))
(def gen-change (partial gen-generic data/embryo-change))

(defn gen-episode [world-state]
  (->> 
    world-state
    (gen-you)
    (gen-need)
    (gen-go)
    (gen-search)
    (gen-find)
    (gen-take)
    (gen-return)
    (gen-change)))