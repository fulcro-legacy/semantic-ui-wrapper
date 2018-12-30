(ns fulcrologic.semantic-ui.workspaces.form
  (:require [fulcro.client.primitives :as fp]
            [fulcro.client.localized-dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [fulcro.client.mutations :as fm]
            [fulcrologic.semantic-ui.factory-helpers :as h]
            [fulcrologic.semantic-ui.modules.ui-input :refer [ui-input]]
            [fulcrologic.semantic-ui.modules.ui-form :refer [ui-form ui-form-input]]))

(def input-control-factory
  ; create input element so it doesn't get clobbered on every render
  (let [input ui-input]
    (fn [js-args]
      (input js-args))))

(fp/defsc FormInputWithInputControl
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
      (ui-form-input {:value my-x-val :control input-control-factory :onChange on-x-change :label "X" :error true})
      (ui-form-input {:value my-y-val :control input-control-factory :onChange on-y-change :label "Y"})))))

(ws/defcard form-input-with-input-control
  (ct.fulcro/fulcro-card
    {::f.portal/root FormInputWithInputControl}))

