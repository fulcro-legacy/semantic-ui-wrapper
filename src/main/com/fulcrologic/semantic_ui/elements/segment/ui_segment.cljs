(ns com.fulcrologic.semantic-ui.elements.segment.ui-segment
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Segment/Segment" :default Segment]))

  (def ui-segment
  "A segment is used to create a grouping of related content.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Attach segment to other content, like a header. (top, bottom)
    - basic (bool): A basic segment has no special formatting.
    - children (node): Primary content.
    - circular (bool): A segment can be circular.
    - className (string): Additional classes.
    - clearing (bool): A segment can clear floated content.
    - color (enum): Segment can be colored. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - compact (bool): A segment may take up only as much space as is necessary.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A segment may show its content is disabled.
    - floated (enum): Segment content can be floated to the left or right. (left, right)
    - inverted (bool): A segment can have its colors inverted for contrast.
    - loading (bool): A segment may show its content is being loaded.
    - padded (bool|enum): A segment can increase its padding. (very)
    - piled (bool): Formatted to look like a pile of pages.
    - placeholder (bool): A segment can be used to reserve space for conditionally displayed content.
    - raised (bool): A segment may be formatted to raise above the page.
    - secondary (bool): A segment can be formatted to appear less noticeable.
    - size (enum): A segment can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - stacked (bool): Formatted to show it contains multiple pages.
    - tertiary (bool): A segment can be formatted to appear even less noticeable.
    - textAlign (enum): Formats content to be aligned as part of a vertical group. (left, center, right)
    - vertical (bool): Formats content to be aligned vertically."
   (h/factory-apply Segment))
