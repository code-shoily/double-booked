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


