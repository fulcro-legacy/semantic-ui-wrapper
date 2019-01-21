(ns fulcrologic.semantic-ui.cards.dropdown
  (:require [devcards.core :refer-macros [defcard]]
            [fulcro.client.dom :as dom]
            [fulcrologic.semantic-ui.icons :as i]
            [fulcrologic.semantic-ui.factories :as f]))

(defcard dropdown
  (dom/div {}
    (f/ui-dropdown {:text "File"} 
      (f/ui-dropdown-menu {}
        (f/ui-dropdown-item {:text "New"})
        (f/ui-dropdown-item {:text "Open..." :description "ctrl + o"})
        (f/ui-dropdown-item {:text "Save as..." :description "ctrl + s"})
        (f/ui-dropdown-item {:text "Rename" :description "ctrl + r"})
        (f/ui-dropdown-item {:text "Make a copy"})
        (f/ui-dropdown-item {:icon i/folder-icon :text "Move to folder"})
        (f/ui-dropdown-item {:icon i/trash-icon :text "Move to trash"})
        (f/ui-dropdown-divider {})
        (f/ui-dropdown-item {:text "Download As..."})
        (f/ui-dropdown-item {:text "Publish To Web"})
        (f/ui-dropdown-item {:text "E-mail Collaborators"})))))

