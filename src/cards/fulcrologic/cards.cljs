(ns fulcrologic.cards
  (:require [devcards.core :refer-macros [defcard-doc defcard]]
            [fulcro.client.cards :refer [defcard-fulcro make-root]]
            [fulcro.client.primitives :as prim :refer [defsc]]
            [fulcro.client.mutations :as m]
            [fulcro.client.dom :as dom]
            [fulcrologic.semantic-ui.icons :as i]
            [fulcrologic.semantic-ui.factories :as f]))

(defsc SomeInputs [this {:keys [name address]}]
  {:query         [:name :address]
   :initial-state {:name "" :address ""}
   :ident         (fn [] [:component/by-id :INPUTS])}
  (dom/div
    "Name:"
    (f/ui-input {:value name :onChange #(m/set-string! this :name :event %)})
    (dom/br)
    "Address:"
    (f/ui-input {:value address :onChange #(m/set-string! this :address :event %)})))

(defcard-fulcro some-inputs
  "This card demonstrates inputs. They are wrapped so that cursor jumping does not happen."
  (make-root SomeInputs {})
  {}
  {:inspect-data true})

(defcard buttons
  (dom/div
    (f/ui-button-group nil
      (f/ui-button nil "A")
      (f/ui-button nil "B")
      (f/ui-button nil "C"))
    (dom/br)
    (f/ui-button {} "A")
    (dom/br)
    (f/ui-button {:content       "Like"
                  :icon          i/heart-icon
                  :label         {:as "a" :basic true :content "2,000"}
                  :labelPosition "left"})
    (dom/br)
    (f/ui-button-group nil
      (f/ui-button {:icon true}

        (f/ui-icon {:name i/align-left-icon}))
      (f/ui-button {:icon true}
        (f/ui-icon {:name i/align-center-icon}))
      (f/ui-button {:icon true}
        (f/ui-icon {:name i/align-right-icon}))
      (f/ui-button {:icon true}
        (f/ui-icon {:name i/align-justify-icon})))
    (f/ui-button {} "C")
    (dom/br)
    (f/ui-button {} "D")))
