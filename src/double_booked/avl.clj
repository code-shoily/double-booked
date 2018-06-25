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
   :finish finish
   :id     id
   :max    -1
   :height -1
   :left   nil
   :right  nil})

;; --------------------------------------- HEIGHT/MAX HELPERS

(defn get-max [node]
  "Returns the max key of a node, 0 if nil"
  (get node :max 0))

(defn get-height [node]
  "Returns the :height key of the node, 0 if nil"
  (get node :height 0))

(defn get-max-height [{left :left right :right}]
  "Returns the max height between the left and right subtrees"
  (max (get-height left) (get-height right)))

(defn get-height-diff [node]
  "Returns the height difference of the node."
  (match [node]
         [nil] 0
         [{:left left :right right}]
         (- (get-height left) (get-height right))))

(defn refresh-max [{:keys [finish left right] :as node}]
  (let [max (max (get-max left)
                 (get-max right)
                 finish)]
    (assoc node :max max)))

;; --------------------------------------- BALANCERS

(defn left-rotate [node]
  (match [node]
         [({:left  b
            :right ({:left  d
                     :right e} :as c)} :as a)]
         (let [a (refresh-max (assoc a :right d
                                       :height (inc (get-max-height {:left b :right d}))))
               res (refresh-max (assoc c :left a
                                         :height (inc (get-max-height {:left a :right e}))))]
           res)))

(defn right-rotate [node] :right_)

(defn right-rotate [node]
  (match [node]
         [({:left  ({:left  d
                     :right e} :as b)
            :right c} :as a)]
         (let [a (refresh-max (assoc a :left e
                                       :height (inc (get-max-height {:left  e
                                                                     :right c}))))
               res (refresh-max (assoc b :right a
                                         :height (inc (get-max-height {:left  d
                                                                       :right a}))))]
           res)))
(defn balance [node key] :balance)
;; --------------------------------------- INSERTION