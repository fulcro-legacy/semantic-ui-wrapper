(ns fulcrologic.semantic-ui.views.item.ui-item-description
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Item/ItemDescription" :default ItemDescription]))

  (def ui-item-description
  "An item can contain a description with a single or multiple paragraphs.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ItemDescription))
