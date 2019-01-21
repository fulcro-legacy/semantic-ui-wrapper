(ns fulcrologic.semantic-ui.elements.divider.ui-divider
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Divider/Divider" :default Divider]))

  (def ui-divider
  "A divider visually segments content into groups.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - clearing (bool): Divider can clear the content above it.
    - content (custom): Shorthand for primary content.
    - fitted (bool): Divider can be fitted without any space above or below it.
    - hidden (bool): Divider can divide content without creating a dividing line.
    - horizontal (bool): Divider can segment content horizontally.
    - inverted (bool): Divider can have its colours inverted.
    - section (bool): Divider can provide greater margins to divide sections of content.
    - vertical (bool): Divider can segment content vertically."
   (h/factory-apply Divider))
