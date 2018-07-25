(ns ^:figwheel-no-load my-first-reagent.dev
  (:require
    [my-first-reagent.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
