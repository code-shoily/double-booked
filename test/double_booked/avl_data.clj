(ns double-booked.avl-data
  (:require [clojure.test :refer :all]))

(def before-left-rotation {:id     :a
                           :start  19
                           :finish 24
                           :max    37
                           :height 3
                           :left   {:id     :b
                                    :start  15
                                    :finish 21
                                    :max    21
                                    :height 0
                                    :left   nil
                                    :right  nil}
                           :right  {:id     :c
                                    :start  21
                                    :finish 19
                                    :max    37
                                    :height 2
                                    :left   {:id     :d
                                             :start  20
                                             :finish 31
                                             :max    31
                                             :height 0
                                             :left   nil
                                             :right  nil}
                                    :right  {:id     :e
                                             :start  29
                                             :finish 32
                                             :height 1
                                             :max    37
                                             :left   {:id     :f
                                                      :start  25
                                                      :finish 28
                                                      :max    28
                                                      :height 0
                                                      :left   nil
                                                      :right  nil}
                                             :right  {:id     :g
                                                      :start  35
                                                      :finish 37
                                                      :max    37
                                                      :height 0
                                                      :left   nil
                                                      :right  nil}}}})
(def after-left-rotation {:id     :c
                          :start  21
                          :finish 19
                          :max    37
                          :height 2
                          :left   {:id     :a
                                   :start  19
                                   :finish 24
                                   :max    31
                                   :height 1
                                   :left   {:id     :b
                                            :start  15
                                            :finish 21
                                            :max    21
                                            :height 0
                                            :left   nil
                                            :right  nil}
                                   :right  {:id     :d
                                            :start  20
                                            :finish 31
                                            :max    31
                                            :height 0
                                            :left   nil
                                            :right  nil}}
                          :right  {:id     :e
                                   :start  29
                                   :finish 32
                                   :height 1
                                   :max    37
                                   :left   {:id     :f
                                            :start  25
                                            :finish 28
                                            :max    28
                                            :height 0
                                            :left   nil
                                            :right  nil}
                                   :right  {:id     :g
                                            :start  35
                                            :finish 37
                                            :max    37
                                            :height 0
                                            :left   nil
                                            :right  nil}}})

(def before-right-rotation {:id     :a
                            :start  30
                            :finish 35
                            :height 3
                            :max    40
                            :left   {:id     :b
                                     :start  28
                                     :finish 32
                                     :height 2
                                     :max    33
                                     :left   {:id     :d
                                              :start  17
                                              :finish 21
                                              :height 1
                                              :max    21
                                              :left   {:id     :f
                                                       :start  12
                                                       :finish 16
                                                       :height 0
                                                       :max    16
                                                       :left   nil
                                                       :right  nil}
                                              :right  {:id     :g
                                                       :start  19
                                                       :finish 20
                                                       :height 0
                                                       :max    20
                                                       :left   nil
                                                       :right  nil}}
                                     :right  {:id     :e
                                              :start  29
                                              :finish 33
                                              :height 0
                                              :max    33
                                              :left   nil
                                              :right  nil}}
                            :right  {:id     :c
                                     :start  33
                                     :finish 40
                                     :height 0
                                     :max    40
                                     :left   nil
                                     :right  nil}})

(def after-right-rotation {:id     :b
                           :start  28
                           :finish 32
                           :height 2
                           :max    40
                           :left   {:id     :d
                                    :start  17
                                    :finish 21
                                    :height 1
                                    :max    21
                                    :left   {:id     :f
                                             :start  12
                                             :finish 16
                                             :height 0
                                             :max    16
                                             :left   nil
                                             :right  nil}
                                    :right  {:id     :g
                                             :start  19
                                             :finish 20
                                             :height 0
                                             :max    20
                                             :left   nil
                                             :right  nil}}
                           :right  {:id     :a
                                    :start  30
                                    :finish 35
                                    :height 1
                                    :max    40
                                    :left   {:id     :e
                                             :start  29
                                             :finish 33
                                             :height 0
                                             :max    33
                                             :left   nil
                                             :right  nil}
                                    :right  {:id     :c
                                             :start  33
                                             :finish 40
                                             :height 0
                                             :max    40
                                             :left   nil
                                             :right  nil}}})

(def before-ll {})
(def after-ll {})
(def before-lr {})
(def after-lr {})
(def before-rl {})
(def after-rl {})
(def before-rr {})
(def after-rr {})