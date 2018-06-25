(ns double-booked.avl-test
  (:require [clojure.test :refer :all]
            [double-booked.avl :refer :all]
            [double-booked.avl-data :as data]))

(deftest mk-tree-test
  (testing "Create an empty tree"
    (is (= (mk-tree) {:root nil :size 0}))))

(deftest mk-node-test
  (testing "Create an 'interval' node"
    (let [id "1"
          start 5
          finish 10
          result-node {:start  start
                       :finish finish
                       :id     id
                       :height -1
                       :max    -1
                       :left   nil
                       :right  nil}]
      (is (= (mk-node id start finish) result-node))
      (is (thrown? AssertionError (mk-node id finish start))))))

(deftest get-max-test
  (testing "get-max returning the max key or 0"
    (is (= (get-max {:max 10}) 10))
    (is (= (get-max nil) 0))))

(deftest get-height-test
  (testing "get-height returning the height key or 0"
    (is (= (get-height {:height 10}) 10))
    (is (= (get-height nil) 0))))

(deftest get-max-height-test
  (testing "get-max-height returning the maximum height of subtree"
    (is (= (get-max-height {:left nil :right nil}) 0))
    (is (= (get-max-height {:left {:height 20} :right nil}) 20))
    (is (= (get-max-height {:left nil :right {:height 20}}) 20))
    (is (= (get-max-height {:left {:height 30} :right {:height 20}}) 30))))


(deftest get-height-diff-test
  (testing "get-max-height returning the maximum height of subtree"
    (is (= (get-height-diff {:left nil :right nil}) 0))
    (is (= (get-height-diff {:left {:height 20} :right nil}) 20))
    (is (= (get-height-diff {:left nil :right {:height 20}}) -20))
    (is (= (get-height-diff {:left {:height 30} :right {:height 20}}) 10))))

(deftest left-rotate-test
  (let [pre-rotation data/before-left-rotation
        post-rotation data/after-left-rotation]
    (testing "left-rotate rotates the subtree to balance"
      (is (= (left-rotate pre-rotation) post-rotation)))))

(deftest right-rotate-test
  (let [pre-rotation data/before-right-rotation
        post-rotation data/after-right-rotation]
    (testing "right-rotate rotates the subtree to balance"
      (is (= (right-rotate pre-rotation) post-rotation)))))

(deftest balance-test
  (testing "balance rotates the subtree to balance"
    (is (= (balance {} 0) :balance))))