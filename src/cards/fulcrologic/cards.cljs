(ns fulcrologic.cards
  (:require [devcards.core :refer-macros [defcard-doc defcard]]
            [sablono.core :as html :refer-macros [html]] ; devcards already brings this in...
            [fulcrologic.semantic-ui.icons :as i]
            [fulcrologic.semantic-ui.factories :as f]))

(defcard buttons
  (html
    [:div
     (f/ui-button #js {} "A")
     (f/ui-button #js {:content       "Like"
                       :icon          i/heart-icon
                       :label         (f/ui-label #js {:as "a" :basic true :pointing "right" :content "2,000"})
                       :labelPosition "left"})
     (f/ui-button #js {} "C")
     (f/ui-button #js {} "D")]))
