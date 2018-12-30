(ns fulcrologic.semantic-ui.modules.ui-button
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Button ButtonOr ButtonGroup ButtonContent]]))

(def ui-button
  "A Button indicates a possible user action.

  Props:
    - active (bool): A button can show it is currently the active user selection.
    - animated (bool|enum): A button can animate to show hidden content. (fade, vertical)
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): A button can be attached to other content. (left, right, top, bottom)
    - basic (bool): A basic button is less pronounced.
    - children (node): Primary content. ()
    - circular (bool): A button can be circular.
    - className (string): Additional classes.
    - color (enum): A button can have different colors (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black, facebook, google plus, instagram, linkedin, twitter, vk, youtube)
    - compact (bool): A button can reduce its padding to fit into tighter spaces.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A button can show it is currently unable to be interacted with.
    - floated (enum): A button can be aligned to the left or right of its container. (left, right)
    - fluid (bool): A button can take the width of its container.
    - icon (custom): Add an Icon by name, props object, or pass an <Icon />.
    - inverted (bool): A button can be formatted to appear on dark backgrounds.
    - label (custom): Add a Label by text, props object, or pass a <Label />.
    - labelPosition (enum): A labeled button can format a Label or Icon to appear on the left or right. (right, left)
    - loading (bool): A button can show a loading indicator.
    - negative (bool): A button can hint towards a negative consequence.
    - onClick (func): Called after user's click.
    - positive (bool): A button can hint towards a positive consequence.
    - primary (bool): A button can be formatted to show different levels of emphasis.
    - role (string): The role of the HTML element.
    - secondary (bool): A button can be formatted to show different levels of emphasis.
    - size (enum): A button can have different sizes. (mini, tiny, small, medium, large, big, huge, massive)
    - tabIndex (number|string): A button can receive focus. ()
    - toggle (bool): A button can be formatted to toggle on and off."
   (h/factory-apply Button))

(def ui-button-or
  "Button groups can contain conditionals.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - text (number|string): Or buttons can have their text localized, or adjusted by using the text prop. ()"
   (h/factory-apply ButtonOr))

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

(def ui-button-content
  "Used in some Button types, such as `animated`.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - hidden (bool): Initially hidden, visible on hover.
    - visible (bool): Initially visible, hidden on hover."
   (h/factory-apply ButtonContent))