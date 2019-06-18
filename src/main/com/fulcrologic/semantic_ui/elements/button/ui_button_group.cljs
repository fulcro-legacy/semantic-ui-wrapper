(ns fulcrologic.semantic-ui.elements.button.ui-button-group
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Button/ButtonGroup" :default ButtonGroup]))

  (def ui-button-group
  "Buttons can be grouped.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Groups can be attached to other content. (left, right, top, bottom)
    - basic (bool): Groups can be less pronounced.
    - buttons (custom): Array of shorthand Button values.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): Groups can have a shared color. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - compact (bool): Groups can reduce their padding to fit into tighter spaces.
    - content (custom): Shorthand for primary content.
    - floated (enum): Groups can be aligned to the left or right of its container. (left, right)
    - fluid (bool): Groups can take the width of their container.
    - icon (bool): Groups can be formatted as icons.
    - inverted (bool): Groups can be formatted to appear on dark backgrounds.
    - labeled (bool): Groups can be formatted as labeled icon buttons.
    - negative (bool): Groups can hint towards a negative consequence.
    - positive (bool): Groups can hint towards a positive consequence.
    - primary (bool): Groups can be formatted to show different levels of emphasis.
    - secondary (bool): Groups can be formatted to show different levels of emphasis.
    - size (enum): Groups can have different sizes. (mini, tiny, small, medium, large, big, huge, massive)
    - toggle (bool): Groups can be formatted to toggle on and off.
    - vertical (bool): Groups can be formatted to appear vertically.
    - widths (enum): Groups can have their widths divided evenly. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
   (h/factory-apply ButtonGroup))
