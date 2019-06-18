(ns fulcrologic.semantic-ui.collections.table.ui-table
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Table/Table" :default Table]))

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
