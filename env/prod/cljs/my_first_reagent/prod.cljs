(ns my-first-reagent.prod
  (:require [my-first-reagent.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
