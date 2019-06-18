(ns com.fulcrologic.semantic-ui.collections.menu.ui-menu-menu
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Menu/MenuMenu" :default MenuMenu]))

  (def ui-menu-menu
  "A menu can contain a sub menu.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - position (enum): A sub menu can take left or right position. (left, right)"
   (h/factory-apply MenuMenu))
