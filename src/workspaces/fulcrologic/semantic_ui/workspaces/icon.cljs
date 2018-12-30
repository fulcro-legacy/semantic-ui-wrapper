(ns fulcrologic.semantic-ui.workspaces.icon
  (:require [fulcro.client.primitives :as fp]
            [fulcro.client.localized-dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [fulcro.client.mutations :as fm]
            [fulcrologic.semantic-ui.modules.ui-icon :refer [ui-icon]]
            [fulcrologic.semantic-ui.icons :as i]
            [clojure.string :as string]
            [cljs.tools.reader :refer [read-string]]
            [cljs.js :refer [empty-state eval js-eval]]))

(defn eval-str [s]
  (eval (empty-state)
        ; s
        (read-string s)
        {:eval       js-eval
         :source-map true
         :def-emits-var true
         :context    :expr}
        (fn [result] result)))

(fp/defsc Icons
  [this {:keys [x]}]
  {:initial-state (fn [_] {:x "x"})
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}
  (let [icons (ns-publics 'fulcrologic.semantic-ui.icons)]
    (dom/div 
      {}
      ; not sure how to eval the icon defs so for now derived by string munging
      ; for future reference: this wokrks but with warnings
      ; (println (eval-str (str (:ns (meta func)) "/" (:name (meta func)))))
      (mapv #(ui-icon {:name (-> % last meta :name name
                                  (string/replace #"-icon" "")
                                  (string/replace #"-" " ")
                                  (string/replace #"_" "")
                                  (string/replace #"wi fi" "wi-fi"))
                        :key  (-> % last meta :name)}) 
            (sort-by #(-> % first) icons)))))

(ws/defcard icons
  (ct.fulcro/fulcro-card
    {::f.portal/root Icons}))

