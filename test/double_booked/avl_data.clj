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

(def before-ll {:id     :a
                :start  15
                :finish 17
                :height 3
                :max    21
                :left   {:id     :b
                         :start  12
                         :finish 14
                         :height 2
                         :max    18
                         :left   {:id     :d
                                  :start  9
                                  :finish 11
                                  :height 1
                                  :max    12
                                  :left   {:id     :f
                                           :start  5
                                           :finish 7
                                           :height 0
                                           :max    7
                                           :left   nil
                                           :right  nil}
                                  :right  {:id     :g
                                           :start  10
                                           :finish 12
                                           :height 0
                                           :max    12
                                           :left   nil
                                           :right  nil}}
                         :right  {:id     :e
                                  :start  13
                                  :finish 18
                                  :height 0
                                  :max    18
                                  :left   nil
                                  :right  nil}}
                :right  {:id     :c
                         :start  18
                         :finish 21
                         :height 0
                         :max    21
                         :left   nil
                         :right  nil}})
(def after-ll {:id     :b
               :start  12
               :finish 14
               :height 2
               :max    21
               :left   {:id     :d
                        :start  9
                        :finish 11
                        :height 1
                        :max    12
                        :left   {:id     :f
                                 :start  5
                                 :finish 7
                                 :height 0
                                 :max    7
                                 :left   nil
                                 :right  nil}
                        :right  {:id     :g
                                 :start  10
                                 :finish 12
                                 :height 0
                                 :max    12
                                 :left   nil
                                 :right  nil}}
               :right  {:id     :a
                        :start  15
                        :finish 17
                        :height 1
                        :max    21
                        :left   {:id     :e
                                 :start  13
                                 :finish 18
                                 :height 0
                                 :max    18
                                 :left   nil
                                 :right  nil}
                        :right  {:id     :c
                                 :start  18
                                 :finish 21
                                 :height 0
                                 :max    21
                                 :left   nil
                                 :right  nil}}})
(def before-lr {:id     :a
                :start  15
                :finish 17
                :height 3
                :max    21
                :left   {:id     :b
                         :start  10
                         :finish 14
                         :height 2
                         :max    18
                         :left   {:id     :d
                                  :start  9
                                  :finish 11
                                  :height 0
                                  :max    11
                                  :left   nil
                                  :right  nil}
                         :right  {:id     :e
                                  :start  13
                                  :finish 18
                                  :height 1
                                  :max    18
                                  :left   {:id     :f
                                           :start  11
                                           :finish 15
                                           :height 0
                                           :max    15
                                           :left   nil
                                           :right  nil}
                                  :right  {:id     :g
                                           :start  14
                                           :finish 21
                                           :height 0
                                           :max    21
                                           :left   nil
                                           :right  nil}}}
                :right  {:id     :c
                         :start  18
                         :finish 21
                         :height 0
                         :max    21
                         :left   {:id     :d
                                  :start  17
                                  :finish 18
                                  :height 1
                                  :max    25
                                  :left   {:id     :f
                                           :start  16
                                           :finish 19
                                           :height 0
                                           :max    19
                                           :left   nil
                                           :right  nil}
                                  :right  {:id     :g
                                           :start  18
                                           :finish 25
                                           :height 0
                                           :max    25
                                           :left   nil
                                           :right  nil}}
                         :right  {:id     :e
                                  :start  24
                                  :finish 31
                                  :height 0
                                  :max    31
                                  :left   nil
                                  :right  nil}}})
(def after-lr {})
(def before-rl {})
(def after-rl {:id     :a
               :start  15
               :finish 17
               :height 3
               :max    31
               :left   {:id     :b
                        :start  12
                        :finish 14
                        :height 0
                        :max    14
                        :left   nil
                        :right  nil}
               :right  {:id     :c
                        :start  19
                        :finish 21
                        :height 2
                        :max    31
                        :left   nil
                        :right  {}}})
(def before-rr {:id     :a
                :start  15
                :finish 17
                :height 3
                :max    35
                :left   {:id     :b
                         :start  12
                         :finish 14
                         :height 0
                         :max    14
                         :left   nil
                         :right  nil}
                :right  {:id     :c
                         :start  18
                         :finish 21
                         :height 2
                         :max    35
                         :left   {:id     :d
                                  :start  16
                                  :finish 20
                                  :height 0
                                  :max    20
                                  :left   nil
                                  :right  nil}
                         :right  {:id     :e
                                  :start  24
                                  :finish 31
                                  :height 1
                                  :max    35
                                  :left   {:id     :f
                                           :start  22
                                           :finish 29
                                           :height 0
                                           :max    29
                                           :left   nil
                                           :right  nil}
                                  :right  {:id     :g
                                           :start  26
                                           :finish 35
                                           :height 0
                                           :max    35
                                           :left   nil
                                           :right  nil}}}})
(def after-rr {:id     :c
               :start  18
               :finish 21
               :height 2
               :max    35
               :left   {:id     :a
                        :start  15
                        :finish 17
                        :height 1
                        :max    20
                        :left   {:id     :b
                                 :start  12
                                 :finish 14
                                 :height 0
                                 :max    14
                                 :left   nil
                                 :right  nil}
                        :right  {:id     :d
                                 :start  16
                                 :finish 20
                                 :height 0
                                 :max    20
                                 :left   nil
                                 :right  nil}}
               :right  {:id     :e
                        :start  24
                        :finish 31
                        :height 1
                        :max    35
                        :left   {:id     :f
                                 :start  22
                                 :finish 29
                                 :height 0
                                 :max    29
                                 :left   nil
                                 :right  nil}
                        :right  {:id     :g
                                 :start  26
                                 :finish 35
                                 :height 0
                                 :max    35
                                 :left   nil
                                 :right  nil}}})