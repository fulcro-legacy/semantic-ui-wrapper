(ns fulcrologic.semantic-ui.extraction-spec
  (:require
    [user :as e]
    [fulcro-spec.core :refer [specification behavior assertions]]))

(specification "Class name derivations"
  (assertions
    "Extracts correct classname when directory and file match names (empty subclass)"
    (e/factory-name-class-and-subclass "src/boo/Button/Button.js") => ["ui-button" "Button" ""]
    (e/factory-name-class-and-subclass "src/boo/Menu/Menu.js") => ["ui-menu" "Menu" ""]
    "Extracts currect subclass when the subclass name matches parent"
    (e/factory-name-class-and-subclass "src/boo/Menu/MenuMenu.js") => ["ui-menu-menu" "Menu" "Menu"]
    "Can extract correct subclass name"
    (e/factory-name-class-and-subclass "src/boo/Button/Item.js") => ["ui-button-item" "Button" "Item"] ))

(specification "Factory generator"
  (assertions
    "generates a legal function"
    (e/gen-factory {:ui-name {:csc [:ui-name "Button" ""]}} {:ui-name "docstring"} :ui-name) => "(def ui-name\n\"docstring\"\n  (sui-factory \"Button\"))\n"))



