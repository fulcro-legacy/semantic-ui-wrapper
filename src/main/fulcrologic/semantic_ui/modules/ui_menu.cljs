(ns fulcrologic.semantic-ui.modules.ui-menu
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Menu MenuMenu MenuItem MenuHeader]]))

(def ui-menu
  "A menu displays grouped navigation actions.

  Props:
    - activeIndex (number|string): Index of the currently active item. ()
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): A menu may be attached to other content segments. (top, bottom)
    - borderless (bool): A menu item or menu can have no borders.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): Additional colors can be specified. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - compact (bool): A menu can take up only the space necessary to fit its content.
    - defaultActiveIndex (number|string): Initial activeIndex value. ()
    - fixed (enum): A menu can be fixed to a side of its context. (left, right, bottom, top)
    - floated (bool|enum): A menu can be floated. (right)
    - fluid (bool): A vertical menu may take the size of its container.
    - icon (bool|enum): A menu may have just icons (bool) or labeled icons. (labeled)
    - inverted (bool): A menu may have its colors inverted to show greater contrast.
    - items (custom): Shorthand array of props for Menu.
    - onItemClick (func): onClick handler for MenuItem. Mutually exclusive with children. ()
    - pagination (bool): A pagination menu is specially formatted to present links to pages of content.
    - pointing (bool): A menu can point to show its relationship to nearby content.
    - secondary (bool): A menu can adjust its appearance to de-emphasize its contents.
    - size (enum): A menu can vary in size. (mini, tiny, small, large, huge, massive)
    - stackable (bool): A menu can stack at mobile resolutions.
    - tabular (bool|enum): A menu can be formatted to show tabs of information. (right)
    - text (bool): A menu can be formatted for text content.
    - vertical (bool): A vertical menu displays elements vertically.
    - widths (enum): A menu can have its items divided evenly. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
   (h/factory-apply Menu))

(def ui-menu-menu
  "A menu can contain a sub menu.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - position (enum): A sub menu can take left or right position. (left, right)"
   (h/factory-apply MenuMenu))

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

(def ui-menu-header
  "A menu item may include a header or may itself be a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply MenuHeader))