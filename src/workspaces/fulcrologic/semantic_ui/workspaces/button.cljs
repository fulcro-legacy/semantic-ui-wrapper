(ns fulcrologic.semantic-ui.workspaces.button
  (:require [fulcro.client.primitives :as fp]
            [fulcro.client.localized-dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [fulcro.client.mutations :as fm]
            [fulcrologic.semantic-ui.modules.ui-button :refer [ui-button-group ui-button]]
            [fulcrologic.semantic-ui.modules.ui-icon :refer [ui-icon]]
            [fulcrologic.semantic-ui.icons :as i]))

(fp/defsc SomeButtons
  [this {:keys [x]}]
  {:initial-state (fn [_] {:x "x"})
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}

  (dom/div {}
      (ui-button-group nil
        (ui-button nil "A")
        (ui-button nil "B")
        (ui-button nil "C"))
      (dom/br)
      (ui-button {} "A")
      (dom/br)
      (ui-button {:content       "Like"
                    :icon          i/heart-icon
                    :label         {:as "a" :basic true :content "2,000"}
                    :labelPosition "left"})
      (dom/br)
      (ui-button-group nil
        (ui-button {:icon true}
          (ui-icon {:name i/align-left-icon}))
        (ui-button {:icon true}
          (ui-icon {:name i/align-center-icon}))
        (ui-button {:icon true}
          (ui-icon {:name i/align-right-icon}))
        (ui-button {:icon true}
          (ui-icon {:name i/align-justify-icon}))
        )
      (ui-button {} "C")
      (dom/br)
      (ui-button {} "D")))

(ws/defcard some-buttons
  (ct.fulcro/fulcro-card
    {::f.portal/root SomeButtons}))

