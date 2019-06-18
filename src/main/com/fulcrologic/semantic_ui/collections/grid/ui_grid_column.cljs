(ns com.fulcrologic.semantic-ui.collections.grid.ui-grid-column
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Grid/GridColumn" :default GridColumn]))

  (def ui-grid-column
  "A column sub-component for Grid.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A grid column can be colored. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - computer (enum): A column can specify a width for a computer. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - floated (enum): A column can sit flush against the left or right edge of a row. (left, right)
    - largeScreen (enum): A column can specify a width for a large screen device. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - mobile (enum): A column can specify a width for a mobile device. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - only (custom): A column can appear only for a specific device, or screen sizes.
    - stretched (bool): A column can stretch its contents to take up the entire grid or row height.
    - tablet (enum): A column can specify a width for a tablet device. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - textAlign (enum): A column can specify its text alignment. (left, center, right, justified)
    - verticalAlign (enum): A column can specify its vertical alignment to have all its columns vertically centered. (bottom, middle, top)
    - widescreen (enum): A column can specify a width for a wide screen device. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - width (enum): Represents width of column. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
   (h/factory-apply GridColumn))
