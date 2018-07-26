(ns my-first-reagent.db
  (:require [reagent.core :as r]))

(def atenas (r/atom [{:id 1 :to-name "" :to-address "" :my-name "hoge" :my-address "shinjuku"}
                     {:id 2 :to-name "" :to-address "" :my-name "hoge" :my-address "shinjuku"}]))
