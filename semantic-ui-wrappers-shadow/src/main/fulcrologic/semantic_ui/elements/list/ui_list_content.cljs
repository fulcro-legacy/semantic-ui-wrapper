(ns fulcrologic.semantic-ui.elements.list.ui-list-content
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/List/ListContent" :default ListContent]))

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
