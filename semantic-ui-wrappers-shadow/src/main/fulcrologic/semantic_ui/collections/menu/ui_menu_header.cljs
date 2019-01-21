(ns fulcrologic.semantic-ui.collections.menu.ui-menu-header
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Menu/MenuHeader" :default MenuHeader]))

  (def ui-menu-header
  "A menu item may include a header or may itself be a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply MenuHeader))
