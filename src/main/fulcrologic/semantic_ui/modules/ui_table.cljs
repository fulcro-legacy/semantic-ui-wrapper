(ns fulcrologic.semantic-ui.modules.ui-table
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Table TableFooter TableCell TableRow TableBody TableHeaderCell TableHeader]]))

(def ui-table
  "A table displays a collections of data grouped into rows.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Attach table to other content (top, bottom)
    - basic (enum|bool): A table can reduce its complexity to increase readability. (very)
    - celled (bool): A table may be divided each row into separate cells.
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsing (bool): A table can be collapsing, taking up only as much space as its rows.
    - color (enum): A table can be given a color to distinguish it from other tables. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - columns (enum): A table can specify its column count to divide its content evenly. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - compact (bool|enum): A table may sometimes need to be more compact to make more rows visible at a time. (very)
    - definition (bool): A table may be formatted to emphasize a first column that defines a rows content.
    - fixed (bool): A table can use fixed a special faster form of table rendering that does not resize table cells based on content
    - footerRow (custom): Shorthand for a TableRow to be placed within Table.Footer.
    - headerRow (custom): Shorthand for a TableRow to be placed within Table.Header.
    - inverted (bool): A table's colors can be inverted.
    - padded (bool|enum): A table may sometimes need to be more padded for legibility. (very)
    - renderBodyRow (func): Mapped over `tableData` and should return shorthand for each Table.Row to be placed within Table.Body. ()
    - selectable (bool): A table can have its rows appear selectable.
    - singleLine (bool): A table can specify that its cell contents should remain on a single line and not wrap.
    - size (enum): A table can also be small or large. (small, large)
    - sortable (bool): A table may allow a user to sort contents by clicking on a table header.
    - stackable (bool): A table can specify how it stacks table content responsively.
    - striped (bool): A table can stripe alternate rows of content with a darker color to increase contrast.
    - structured (bool): A table can be formatted to display complex structured data.
    - tableData (array): Data to be passed to the renderBodyRow function. ()
    - textAlign (enum): A table can adjust its text alignment. (left, center, right)
    - unstackable (bool): A table can specify how it stacks table content responsively.
    - verticalAlign (enum): A table can adjust its text alignment. (bottom, middle, top)"
   (h/factory-apply Table))

(def ui-table-footer
  "A table can have a footer.

  Props:
    - as (custom): An element type to render as (string or function)."
   (h/factory-apply TableFooter))

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

(def ui-table-row
  "A table can have rows.

  Props:
    - active (bool): A row can be active or selected by a user.
    - as (custom): An element type to render as (string or function).
    - cellAs (custom): An element type to render as (string or function).
    - cells (custom): Shorthand array of props for TableCell.
    - children (node): Primary content.
    - className (string): Additional classes.
    - disabled (bool): A row can be disabled.
    - error (bool): A row may call attention to an error or a negative value.
    - negative (bool): A row may let a user know whether a value is bad.
    - positive (bool): A row may let a user know whether a value is good.
    - textAlign (enum): A table row can adjust its text alignment. (left, center, right)
    - verticalAlign (enum): A table row can adjust its vertical alignment. (bottom, middle, top)
    - warning (bool): A row may warn a user."
   (h/factory-apply TableRow))

(def ui-table-body
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes."
   (h/factory-apply TableBody))

(def ui-table-header-cell
  "A table can have a header cell.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - sorted (enum): A header cell can be sorted in ascending or descending order. (ascending, descending)"
   (h/factory-apply TableHeaderCell))

(def ui-table-header
  "A table can have a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fullWidth (bool): A definition table can have a full width header or footer, filling in the gap left by the first column."
   (h/factory-apply TableHeader))