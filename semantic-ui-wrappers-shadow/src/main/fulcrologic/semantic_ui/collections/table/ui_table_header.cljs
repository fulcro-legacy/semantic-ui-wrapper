(ns fulcrologic.semantic-ui.collections.table.ui-table-header
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Table/TableHeader" :default TableHeader]))

  (def ui-table-header
  "A table can have a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fullWidth (bool): A definition table can have a full width header or footer, filling in the gap left by the first column."
   (h/factory-apply TableHeader))
