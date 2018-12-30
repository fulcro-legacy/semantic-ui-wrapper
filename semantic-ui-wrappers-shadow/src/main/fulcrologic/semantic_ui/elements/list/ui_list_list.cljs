(ns fulcrologic.semantic-ui.elements.list.ui-list-list
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/List/ListList" :default ListList]))

  (def ui-list-list
  "A list can contain a sub list.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ListList))
