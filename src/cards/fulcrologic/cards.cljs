(ns fulcrologic.cards
  (:require [devcards.core :refer-macros [defcard-doc defcard]]
            [sablono.core :as html :refer-macros [html]]    ; devcards already brings this in...
            [fulcrologic.semantic-ui.icons :as i]
            [fulcrologic.semantic-ui.factories :as f]))

(defcard buttons
  (html
    [:div
     (f/ui-button-group nil
       (f/ui-button nil "A")
       (f/ui-button nil "B")
       (f/ui-button nil "C"))
     [:br]
     (f/ui-button {} "A")
     [:br]
     (f/ui-button {:content       "Like"
                   :icon          i/heart-icon
                   :label         {:as "a" :basic true :content "2,000"}
                   :labelPosition "left"})
     [:br]
     (f/ui-button-group nil
       (f/ui-button {:icon true}

         (f/ui-icon {:name i/align-left-icon}))
       (f/ui-button {:icon true}
         (f/ui-icon {:name i/align-center-icon}))
       (f/ui-button {:icon true}
         (f/ui-icon {:name i/align-right-icon}))
       (f/ui-button {:icon true}
         (f/ui-icon {:name i/align-justify-icon})))
     (f/ui-button {} "C")
     [:br]
     (f/ui-button {} "D")]))
