(ns generative-episodic-story-embryo.data
  (:require [generative-episodic-story-embryo.pure-random :as pure-random]
            [selmer.parser :as selmer]))


(def default-world-state
  {:current-ep []
   :past-eps []
   :person {:name "Alice"}})

;; Names of characters (Good old Alice and Bob)
(def names 
  ["Alice" 
   "Bob" 
   "Carol" 
   "Chuck" 
   "Eve" 
   "Sybil"])

(def embryo-you 
  ["{{person.name}} lived in a place."])

(def embryo-need
  ["{{person.name}} wanted something."])

(def embryo-go
  ["{{person.name}} started to do something."])

(def embryo-search
  ["{{person.name}} has a hard time."])

(def embryo-find
  ["{{person.name}} get something that they didn't really want."])

(def embryo-take
  ["{{person.name}} takes what they need."])

(def embryo-return
  ["{{person.name}} starts to return."])

(def embryo-change
  ["{{person.name}} feels like they have grown."])