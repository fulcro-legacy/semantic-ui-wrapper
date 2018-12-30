(ns fulcrologic.semantic-ui.workspaces.form
  (:require [fulcro.client.primitives :as fp]
            [fulcro.client.localized-dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [fulcro.client.mutations :as fm]
            [fulcrologic.semantic-ui.factory-helpers :as h]
            [fulcrologic.semantic-ui.elements.input.ui-input :refer [ui-input]]
            [fulcrologic.semantic-ui.collections.form.ui-form :refer [ui-form]]
            [fulcrologic.semantic-ui.collections.form.ui-form-input :refer [ui-form-input]]))

(fp/defsc FormInput
  [this {:keys [my-x-val my-y-val]}]
  {:initial-state (fn [_] {:my-x-val "" :my-y-val ""})
   :ident         (fn [] [::id "singleton-form-input"])
   :query         [:my-x-val :my-y-val]}
  (let [on-x-change (fn [evt _] (fm/set-string! this :my-x-val :event evt))
        on-y-change (fn [evt _] (fm/set-string! this :my-y-val :event evt))]
  (dom/div
    (dom/p {} (str "x: " my-x-val))
    (dom/p {} (str "y: " my-y-val))
    (ui-form {:error true}
      (ui-form-input {:value my-x-val :onChange on-x-change :label "X" :error true})
      (ui-form-input {:value my-y-val :onChange on-y-change :label "Y"})))))

(ws/defcard form-input-with-input-control
  (ct.fulcro/fulcro-card
    {::f.portal/root FormInput}))

