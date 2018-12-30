(ns fulcrologic.semantic-ui.views.item.ui-item-group
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Item/ItemGroup" :default ItemGroup]))

  (def ui-item-group
  "A group of items.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - divided (bool): Items can be divided to better distinguish between grouped content.
    - items (custom): Shorthand array of props for Item.
    - link (bool): An item can be formatted so that the entire contents link to another page.
    - relaxed (bool|enum): A group of items can relax its padding to provide more negative space. (very)
    - unstackable (bool): Prevent items from stacking on mobile."
   (h/factory-apply ItemGroup))
