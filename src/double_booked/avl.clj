(ns double-booked.avl
  (:require [clojure.core.match :refer [match]]
            [double-booked.utils :refer [convert-date]]))

(defn mk-tree
  "Makes a new tree with no root (therefore size 0)"
  [] {:root nil :size 0})


(defn mk-node [id start finish]
  {:pre [(< start finish)]}
  "Makes a Node from strings id, start and finish"
  {:start  start
   :finish   finish
   :id     id
   :max    -1
   :height -1
   :left   nil
   :right  nil})

;; --------------------------------------- HEIGHT/MAX HELPERS

;; --------------------------------------- BALANCERS
(defn left-rotate [node] :left-rotate)
(defn right-rotate [node] :right-rotate)
(defn balance [node key] :balance)
;; --------------------------------------- INSERTION









