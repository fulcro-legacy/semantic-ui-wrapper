(ns com.fulcrologic.semantic-ui.elements.label.ui-label
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Label/Label" :default Label]))

  (def ui-label
  "A label displays content classification.

  Props:
    - active (bool): A label can be active.
    - as (custom): An element type to render as (string or function).
    - attached (enum): A label can attach to a content segment. (top, bottom, top right, top left, bottom left, bottom right)
    - basic (bool): A label can reduce its complexity.
    - children (node): Primary content.
    - circular (bool): A label can be circular.
    - className (string): Additional classes.
    - color (enum): Color of the label. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - corner (bool|enum): A label can position itself in the corner of an element. (left, right)
    - detail (custom): Shorthand for LabelDetail.
    - empty (bool): Formats the label as a dot. ()
    - floating (bool): Float above another element in the upper right corner.
    - horizontal (bool): A horizontal label is formatted to label content along-side it horizontally.
    - icon (custom): Shorthand for Icon.
    - image (bool|custom): A label can be formatted to emphasize an image or prop can be used as shorthand for Image. ()
    - onClick (func): Called on click.
    - onRemove (func): Adds an \"x\" icon, called when \"x\" is clicked.
    - pointing (bool|enum): A label can point to content next to it. (above, below, left, right)
    - removeIcon (custom): Shorthand for Icon to appear as the last child and trigger onRemove.
    - ribbon (bool|enum): A label can appear as a ribbon attaching itself to an element. (right)
    - size (enum): A label can have different sizes. (mini, tiny, small, medium, large, big, huge, massive)
    - tag (bool): A label can appear as a tag."
   (h/factory-apply Label))
