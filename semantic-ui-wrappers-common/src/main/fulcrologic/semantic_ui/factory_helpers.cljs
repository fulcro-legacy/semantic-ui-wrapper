(ns fulcrologic.semantic-ui.factory-helpers
  (:require [fulcro.client.dom :as dom]
            [goog.object :as gobj]))

(defn factory-apply
  [class]
  (fn [props & children]
    (apply js/React.createElement class (clj->js props) children)))

(defn wrapped-factory-apply
  "Returns a factory that wraps the given class as an input. Requires that the target item support `:value` as a prop." 
  [class]
  (let [factory (dom/wrap-form-element class)]
    (fn [props & children] 
      (apply factory (clj->js props) children))))

