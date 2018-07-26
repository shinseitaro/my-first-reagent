(ns my-first-reagent.components.atena
  (:require [my-first-reagent.db :as db]))

; (defn atena
;   []
;   [:main
;    [:div
;     (for [{:keys [id to-name to-address my-name my-address]} (vals @db/atenas)]
;       [:div {:key id}
;        [to-address]
;        [to-name]
;        [my-address]
;        [my-name]


(defn atena
  []
  [:main
   [:div
    (for [{:keys [id to-name to-address my-name my-address]} @db/atenas]
      [:div.container ;{:style "display:grid"}
       [:h2 id
        [:h4 (str "from " my-address " " my-name)]]])]])
