(ns fulcrologic.semantic-ui.collections.menu.ui-menu-item
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Menu/MenuItem" :default MenuItem]))

  (def ui-menu-item
  "A menu can contain an item.

  Props:
    - active (bool): A menu item can be active.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): Additional colors can be specified. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - disabled (bool): A menu item can be disabled.
    - fitted (bool|enum): A menu item or menu can remove element padding, vertically or horizontally. (horizontally, vertically)
    - header (bool): A menu item may include a header or may itself be a header.
    - icon (bool|custom): MenuItem can be only icon. ()
    - index (number): MenuItem index inside Menu.
    - link (bool): A menu item can be link.
    - name (string): Internal name of the MenuItem.
    - onClick (func): Called on click. When passed, the component will render as an `a`
    - position (enum): A menu item can take left or right position. (left, right)"
   (h/factory-apply MenuItem))
