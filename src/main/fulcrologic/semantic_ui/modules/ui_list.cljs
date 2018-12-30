(ns fulcrologic.semantic-ui.modules.ui-list
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [List ListDescription ListHeader ListItem ListIcon ListList ListContent]]))

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

(def ui-list-description
  "A list item can contain a description.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ListDescription))

(def ui-list-header
  "A list item can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ListHeader))

(def ui-list-item
  "A list item can contain a set of items.

  Props:
    - active (bool): A list item can active.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for ListDescription.
    - disabled (bool): A list item can disabled.
    - header (custom): Shorthand for ListHeader.
    - icon (custom): Shorthand for ListIcon. ()
    - image (custom): Shorthand for Image. ()
    - onClick (func): A ListItem can be clicked
    - value (string): A value for an ordered list."
   (h/factory-apply ListItem))

(def ui-list-icon
  "A list item can contain an icon.

  Props:
    - className (string): Additional classes.
    - verticalAlign (enum): An element inside a list can be vertically aligned. (bottom, middle, top)"
   (h/factory-apply ListIcon))

(def ui-list-list
  "A list can contain a sub list.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ListList))

(def ui-list-content
  "A list item can contain a content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for ListDescription.
    - floated (enum): An list content can be floated left or right. (left, right)
    - header (custom): Shorthand for ListHeader.
    - verticalAlign (enum): An element inside a list can be vertically aligned. (bottom, middle, top)"
   (h/factory-apply ListContent))