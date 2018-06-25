(ns double-booked.utils
  (:require [clj-time.format :as f]
            [clj-time.coerce :as c]))

(defn str->date
  "Takes a string and returns DateTime instance"
  [date format]
  (->> date
       (f/parse (f/formatter format))
       (.toDate)))

(defn date->long
  "Takes a date object and returns the UNIX timestamp"
  [date]
  (c/to-long date))

(defn convert-date
  "Takes a string of a specific format and converts to long"
  [date & {:keys [format]
           :or   {format "YYYY-MM-dd' 'HH:mm"}}]
  (-> date
      (str->date format)
      date->long))

(defn overlaps? [{s1 :start f1 :finish}
                 {s2 :start f2 :finish}]
  "Checks if two nodes overlaps"
  (and (< s1 f2)
       (< s2 f1)))


