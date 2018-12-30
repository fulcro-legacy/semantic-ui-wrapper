(ns fulcrologic.semantic-ui.workspaces.dropdown
  (:require [fulcro.client.primitives :as fp]
            [fulcro.client.localized-dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [fulcrologic.semantic-ui.modules.dropdown.ui-dropdown :refer [ui-dropdown]]
            [fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-menu :refer [ui-dropdown-menu]]
            [fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-item :refer [ui-dropdown-item]]
            [fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-divider :refer [ui-dropdown-divider]]
            [fulcrologic.semantic-ui.elements.icon.ui-icon :refer [ui-icon]]
            [fulcrologic.semantic-ui.icons :as i]))

(fp/defsc Dropdown
  [this {:keys [x]}]
  {:initial-state (fn [_] {:x "x"})
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}

  (dom/div {}
    (ui-dropdown {:text "File"} 
      (ui-dropdown-menu {}
        (ui-dropdown-item {:text "New"})
        (ui-dropdown-item {:text "Open..." :description "ctrl + o"})
        (ui-dropdown-item {:text "Save as..." :description "ctrl + s"})
        (ui-dropdown-item {:text "Rename" :description "ctrl + r"})
        (ui-dropdown-item {:text "Make a copy"})
        (ui-dropdown-item {:icon i/folder-icon :text "Move to folder"})
        (ui-dropdown-item {:icon i/trash-icon :text "Move to trash"})
        (ui-dropdown-divider {})
        (ui-dropdown-item {:text "Download As..."})
        (ui-dropdown-item {:text "Publish To Web"})
        (ui-dropdown-item {:text "E-mail Collaborators"})))))

(ws/defcard dropdown
  (ct.fulcro/fulcro-card
    {::f.portal/root Dropdown}))
