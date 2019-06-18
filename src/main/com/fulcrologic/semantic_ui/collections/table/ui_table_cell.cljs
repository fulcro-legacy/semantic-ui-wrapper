(ns com.fulcrologic.semantic-ui.collections.table.ui-table-cell
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Table/TableCell" :default TableCell]))

  (def ui-table-cell
  "A table row can have cells.

  Props:
    - active (bool): A cell can be active or selected by a user.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsing (bool): A cell can be collapsing so that it only uses as much space as required.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A cell can be disabled.
    - error (bool): A cell may call attention to an error or a negative value.
    - icon (custom): Add an Icon by name, props object, or pass an <Icon />
    - negative (bool): A cell may let a user know whether a value is bad.
    - positive (bool): A cell may let a user know whether a value is good.
    - selectable (bool): A cell can be selectable.
    - singleLine (bool): A cell can specify that its contents should remain on a single line and not wrap.
    - textAlign (enum): A table cell can adjust its text alignment. (left, center, right)
    - verticalAlign (enum): A table cell can adjust its text alignment. (bottom, middle, top)
    - warning (bool): A cell may warn a user.
    - width (enum): A table can specify the width of individual columns independently. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
   (h/factory-apply TableCell))
