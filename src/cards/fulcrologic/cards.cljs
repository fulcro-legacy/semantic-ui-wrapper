(ns fulcrologic.cards
  (:require [devcards.core :refer-macros [defcard-doc defcard]]
            [sablono.core :as html :refer-macros [html]]
            [fulcrologic.semantic-ui.factories :as f]))

(defcard buttons
  (html
    [:div
     (f/ui-button #js {} "A")
     (f/ui-button #js {} "B")
     (f/ui-button #js {} "C")
     (f/ui-button #js {} "D")]))
