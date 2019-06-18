(ns fulcrologic.semantic-ui.workspaces.input
  (:require [fulcro.client.primitives :as fp]
            [fulcro.client.localized-dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [fulcro.client.mutations :as fm]
            [fulcrologic.semantic-ui.elements.input.ui-input :refer [ui-input]]
            [fulcrologic.semantic-ui.factory-helpers :as h]))

(fp/defsc Input
  [this {:keys [my-val]}]
  {:initial-state (fn [_] {:my-val ""})
   :ident         (fn [] [::id "singleton"])
   :query         [:my-val]}
  (dom/div
    (ui-input {:value my-val :onChange #(fm/set-string! this :my-val :event %)})))

(ws/defcard input
  (ct.fulcro/fulcro-card
    {::f.portal/root Input}))

