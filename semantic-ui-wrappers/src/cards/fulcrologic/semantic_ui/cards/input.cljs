(ns fulcrologic.semantic-ui.cards.input
  (:require [fulcro.client.cards :refer [defcard-fulcro]]
            [fulcro.client.primitives :as prim :refer [defsc]]
            [fulcro.client.mutations :as m :refer [defmutation]]
            [fulcro.client.dom :as dom]
            [fulcrologic.semantic-ui.factories :as f]))

(defmutation change-val
  [{:keys [key val]}]
  (action [{:keys [state]}]
    (swap! state assoc key val)))

(defsc Input 
  [this {:keys [my-x-val my-y-val]}]
  {:initial-state (fn [_] {:my-x-val "" :my-y-val ""})
   :query         [:my-x-val :my-y-val]}
  (let [on-x-change (fn [evt _] (prim/transact! this `[(change-val ~{:key :my-x-val :val (.. evt -target -value) })] ))
        on-y-change (fn [evt _] (prim/transact! this `[(change-val ~{:key :my-y-val :val (.. evt -target -value) })] ))]
  (dom/div
    (dom/p {} (str "x: " my-x-val))
    (dom/p {} (str "y: " my-y-val))
    (dom/div {}
      (f/ui-input {:value my-x-val :onChange on-x-change :label "X" :error true}))
    (dom/div {}
      (f/ui-input {:value my-y-val :onChange on-y-change :label "Y"})))))

(defcard-fulcro form-input
  Input
  {}  
  {:inspect-data true})

