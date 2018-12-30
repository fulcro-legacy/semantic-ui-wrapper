(ns fulcrologic.semantic-ui.elements.list.ui-list-icon
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/List/ListIcon" :default ListIcon]))

  (def ui-list-icon
  "A list item can contain an icon.

  Props:
    - className (string): Additional classes.
    - verticalAlign (enum): An element inside a list can be vertically aligned. (bottom, middle, top)"
   (h/factory-apply ListIcon))
