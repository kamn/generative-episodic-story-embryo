(ns generative-episodic-story-embryo.planner
  (:require [datascript.core :as d]
            [selmer.parser :as selmer]))

;;http://udayv.com/clojurescript/clojure/2016/04/28/datascript101-chapter1-initializing-inserting-and-querying-records/
;;http://udayv.com/clojurescript/clojure/2016/05/06/datascript101-chapter2-uniqueness-and-indexing/
;; Fisrt goal is to try to do the blockworlds in the planner
(def schema {})

(def conn (d/create-conn schema))

(d/transact! conn 
  [{:db/id -1
    :table/name "x"}])

(d/transact! conn 
  [{:db/id -1
    :table/name "y"}])

(d/transact! conn 
  [{:db/id -1
    :block/name "a"}])

(d/transact! conn 
  [{:db/id -1
    :block/name "b"}])

(d/transact! conn
  [{:relation/block "a"
    :relation/table "x"}])

(d/transact! conn
  [{:relation/block "b"
    :relation/table "y"}])

(def r (d/q 
        '[:find ?e ?bn ?e3 ?tn ?e4 ?tn2
          :where
          [?e :block/name ?bn] 
          [?e2 :relation/block ?bn]
          [?e2 :relation/table ?tn]
          [?e3 :table/name ?tn]
          [?e4 :table/name ?tn2]
          [(not= ?tn2 ?tn)]]
         @conn))