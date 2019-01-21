(ns fulcrologic.semantic-ui.cards.icon
  (:require [fulcro.client.cards :refer [defcard-fulcro]]
            [fulcro.client.primitives :as prim :refer [defsc]]
            [fulcro.client.dom :as dom]
            [fulcrologic.semantic-ui.factories :as f]
            [clojure.string :as string]
            [cljs.tools.reader :refer [read-string]]
            [cljs.js :refer [empty-state eval js-eval]])) 

(defn eval-str [s]
  (eval (empty-state)
        (read-string s)
        {:eval       js-eval
         :source-map true
         :def-emits-var true
         :context    :expr}
        (fn [result] result)))

(defsc Icons
  [this {:keys [x]}]
  {:initial-state (fn [_] {:x "x"})
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}
  (let [icons (ns-publics 'fulcrologic.semantic-ui.icons)]
    (dom/div 
      {}
      ; not sure how to eval the icon defs so for now derived by string munging
      ; for future reference: this works but with warnings:
      ; (println (eval-str (str (:ns (meta func)) "/" (:name (meta func)))))
      (mapv #(f/ui-icon {:name (-> % last meta :name name
                                  (string/replace #"-icon" "")
                                  (string/replace #"-" " ")
                                  (string/replace #"_" "")
                                  (string/replace #"wi fi" "wi-fi"))
                         :key  (-> % last meta :name)}) 
            (sort-by #(-> % first) icons)))))

(defcard-fulcro icons
  Icons
  {}  
  {:inspect-data true})

