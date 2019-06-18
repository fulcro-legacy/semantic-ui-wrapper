(ns fulcrologic.semantic-ui.collections.grid.ui-grid-row
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Grid/GridRow" :default GridRow]))

  (def ui-grid-row
  "A row sub-component for Grid.

  Props:
    - as (custom): An element type to render as (string or function).
    - centered (bool): A row can have its columns centered.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A grid row can be colored. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - columns (enum): Represents column count per line in Row. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, equal)
    - divided (bool): A row can have dividers between its columns.
    - only (custom): A row can appear only for a specific device, or screen sizes.
    - reversed (custom): A row can specify that its columns should reverse order at different device sizes.
    - stretched (bool): A row can stretch its contents to take up the entire column height.
    - textAlign (enum): A row can specify its text alignment. (left, center, right, justified)
    - verticalAlign (enum): A row can specify its vertical alignment to have all its columns vertically centered. (bottom, middle, top)"
   (h/factory-apply GridRow))
