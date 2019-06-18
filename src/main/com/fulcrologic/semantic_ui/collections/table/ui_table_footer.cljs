(ns fulcrologic.semantic-ui.collections.table.ui-table-footer
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Table/TableFooter" :default TableFooter]))

  (def ui-table-footer
  "A table can have a footer.

  Props:
    - as (custom): An element type to render as (string or function)."
   (h/factory-apply TableFooter))
