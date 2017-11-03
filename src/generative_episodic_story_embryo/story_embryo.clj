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

(defn gen-you [world-state]
  (let [you-str (get-text data/embryo-you world-state)]
    (append-to-ep you-str world-state)))

(defn gen-need [world-state]
  (let [you-str (get-text data/embryo-need world-state)]
    (append-to-ep you-str world-state)))

(defn gen-go [world-state]
  (let [you-str (get-text data/embryo-go world-state)]
    (append-to-ep you-str world-state)))

(defn gen-search [world-state]
  (let [you-str (get-text data/embryo-search world-state)]
    (append-to-ep you-str world-state)))

(defn gen-find [world-state]
  (let [you-str (get-text data/embryo-find world-state)]
    (append-to-ep you-str world-state)))

(defn gen-take [world-state]
  (let [you-str (get-text data/embryo-take world-state)]
    (append-to-ep you-str world-state)))

(defn gen-return [world-state]
  (let [you-str (get-text data/embryo-return world-state)]
    (append-to-ep you-str world-state)))

(defn gen-change [world-state]
  (let [you-str (get-text data/embryo-change world-state)]
    (append-to-ep you-str world-state)))

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