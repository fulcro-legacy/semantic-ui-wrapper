(ns com.fulcrologic.semantic-ui.views.item.ui-item-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Item/ItemContent" :default ItemContent]))

  (def ui-item-content
  "An item can contain content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for ItemDescription component.
    - extra (custom): Shorthand for ItemExtra component.
    - header (custom): Shorthand for ItemHeader component.
    - meta (custom): Shorthand for ItemMeta component.
    - verticalAlign (enum): Content can specify its vertical alignment. (bottom, middle, top)"
   (h/factory-apply ItemContent))
