(ns com.fulcrologic.semantic-ui.elements.list.ui-list
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/List/List" :default List]))

  (def ui-list
  "A list groups related content.

  Props:
    - animated (bool): A list can animate to set the current item apart from the list.
    - as (custom): An element type to render as (string or function).
    - bulleted (bool): A list can mark items with a bullet.
    - celled (bool): A list can divide its items into cells.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - divided (bool): A list can show divisions between content.
    - floated (enum): An list can be floated left or right. (left, right)
    - horizontal (bool): A list can be formatted to have items appear horizontally.
    - inverted (bool): A list can be inverted to appear on a dark background.
    - items (custom): Shorthand array of props for ListItem.
    - link (bool): A list can be specially formatted for navigation links.
    - onItemClick (func): onClick handler for ListItem. Mutually exclusive with children. ()
    - ordered (bool): A list can be ordered numerically.
    - relaxed (bool|enum): A list can relax its padding to provide more negative space. (very)
    - selection (bool): A selection list formats list items as possible choices.
    - size (enum): A list can vary in size. (mini, tiny, small, medium, large, big, huge, massive)
    - verticalAlign (enum): An element inside a list can be vertically aligned. (bottom, middle, top)"
   (h/factory-apply List))
