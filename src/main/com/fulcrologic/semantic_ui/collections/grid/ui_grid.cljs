(ns fulcrologic.semantic-ui.collections.grid.ui-grid
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Grid/Grid" :default Grid]))

  (def ui-grid
  "A grid is used to harmonize negative space in a layout.

  Props:
    - as (custom): An element type to render as (string or function).
    - celled (bool|enum): A grid can have rows divided into cells. (internally)
    - centered (bool): A grid can have its columns centered.
    - children (node): Primary content.
    - className (string): Additional classes.
    - columns (enum): Represents column count per row in Grid. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, equal)
    - container (bool): A grid can be combined with a container to use the available layout and alignment.
    - divided (bool|enum): A grid can have dividers between its columns. (vertically)
    - doubling (bool): A grid can double its column width on tablet and mobile sizes.
    - inverted (bool): A grid's colors can be inverted.
    - padded (bool|enum): A grid can preserve its vertical and horizontal gutters on first and last columns. (horizontally, vertically)
    - relaxed (bool|enum): A grid can increase its gutters to allow for more negative space. (very)
    - reversed (custom): A grid can specify that its columns should reverse order at different device sizes.
    - stackable (bool): A grid can have its columns stack on-top of each other after reaching mobile breakpoints.
    - stretched (bool): A grid can stretch its contents to take up the entire grid height.
    - textAlign (enum): A grid can specify its text alignment. (left, center, right, justified)
    - verticalAlign (enum): A grid can specify its vertical alignment to have all its columns vertically centered. (bottom, middle, top)"
   (h/factory-apply Grid))
