(ns double-booked.utils-test
  (:require [clojure.test :refer :all]
            [double-booked.utils :refer :all]))

(deftest str->date-test
  (testing "Test date parsing"
    (is (= (str->date "2018-12-01 12:00" "YYYY-MM-dd' 'HH:mm")
           #inst "2018-12-01T12:00:00.000-00:00"))
    (is (= (str->date "2018-12-01" "YYYY-MM-dd")
           #inst "2018-12-01T00:00:00.000-00:00"))))

(deftest date->long-test
  (testing "Date to Long parsing"
    (is (= (date->long #inst "2018-12-01T12:00:00.000-00:00")
           1543665600000))))

(deftest convert-date-test
  (testing "Test string to long conversation"
    (is (= (convert-date "2018-12-01 12:00")
           1543665600000))
    (is (= (convert-date "2018-12-01" :format "YYYY-MM-dd")
           1543622400000))))