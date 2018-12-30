(ns fulcrologic.semantic-ui.modules.ui-grid
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Grid GridRow GridColumn]]))

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