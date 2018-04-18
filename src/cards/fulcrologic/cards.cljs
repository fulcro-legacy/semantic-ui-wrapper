(ns fulcrologic.cards
  (:require [devcards.core :refer-macros [defcard-doc defcard]]
            [sablono.core :as html :refer-macros [html]]    ; devcards already brings this in...
            [fulcrologic.semantic-ui.icons :as i]
            [fulcrologic.semantic-ui.factories :as f]))

(defcard buttons
  (html
    [:div
     (f/button-group nil
       (f/button nil "A")
       (f/button nil "B")
       (f/button nil "C"))
     [:br]
     (f/button #js {} "A")
     [:br]
     (f/button #js {:content       "Like"
                    :icon          i/heart-icon
                    :label         #js {:as "a" :basic true :content "2,000"}
                    :labelPosition "left"})
     [:br]
     (f/button-group nil
       (f/button #js {:icon true}
         (f/icon #js {:name i/align-left-icon}))
       (f/button #js {:icon true}
         (f/icon #js {:name i/align-center-icon}))
       (f/button #js {:icon true}
         (f/icon #js {:name i/align-right-icon}))
       (f/button #js {:icon true}
         (f/icon #js {:name i/align-justify-icon})))
     (f/button #js {} "C")
     [:br]
     (f/button #js {} "D")]))
