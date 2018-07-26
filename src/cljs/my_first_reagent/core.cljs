(ns my-first-reagent.core
  (:require [reagent.core :as reagent :refer [atom]]
            [secretary.core :as secretary :include-macros true]
            [accountant.core :as accountant]
            [my-first-reagent.components.atena :refer [atena]]
            [my-first-reagent.components.header :refer [header]]
            [my-first-reagent.components.footer :refer [footer]]))

;; -------------------------
;; Views

(defn home-page []
  [:div.container
   [header]
   [atena]
   [footer]])
;; -------------------------
;; Routes

(defonce page (atom #'home-page))

(defn current-page []
  [:div [@page]])

(secretary/defroute "/" []
                    (reset! page #'home-page))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (accountant/configure-navigation!
   {:nav-handler
    (fn [path]
      (secretary/dispatch! path))
    :path-exists?
    (fn [path]
      (secretary/locate-route path))})
  (accountant/dispatch-current!)
  (mount-root))
