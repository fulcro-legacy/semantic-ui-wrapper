(ns fulcrologic.cards
  (:require [devcards.core :refer-macros [defcard-doc defcard]]
            [sablono.core :as html :refer-macros [html]]
            [fulcrologic.semantic-ui.icons :as i]
            [fulcrologic.semantic-ui.factories :as f]))

(defcard buttons
  (html
    [:div
     (f/button #js {} "A")
     (f/button #js {:content       "Like"
                       :icon          i/heart-icon
                       :label         (f/label #js {:as "a" :basic true :pointing "right" :content "2,000"})
                       :labelPosition "left"})
     (f/button #js {} "C")
     (f/button #js {} "D")]))
