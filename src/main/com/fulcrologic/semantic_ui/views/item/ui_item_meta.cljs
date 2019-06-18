(ns fulcrologic.semantic-ui.views.item.ui-item-meta
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Item/ItemMeta" :default ItemMeta]))

  (def ui-item-meta
  "An item can contain content metadata.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ItemMeta))
