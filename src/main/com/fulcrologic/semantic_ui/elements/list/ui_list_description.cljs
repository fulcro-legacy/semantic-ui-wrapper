(ns fulcrologic.semantic-ui.elements.list.ui-list-description
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/List/ListDescription" :default ListDescription]))

  (def ui-list-description
  "A list item can contain a description.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ListDescription))
