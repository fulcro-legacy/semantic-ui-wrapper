(ns fulcrologic.semantic-ui.modules.ui-segment
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Segment SegmentGroup SegmentInline]]))

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

(def ui-segment-group
  "A group of segments can be formatted to appear together.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - compact (bool): A segment may take up only as much space as is necessary.
    - content (custom): Shorthand for primary content.
    - horizontal (bool): Formats content to be aligned horizontally.
    - piled (bool): Formatted to look like a pile of pages.
    - raised (bool): A segment group may be formatted to raise above the page.
    - size (enum): A segment group can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - stacked (bool): Formatted to show it contains multiple pages."
   (h/factory-apply SegmentGroup))

(def ui-segment-inline
  "A placeholder segment can be inline.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply SegmentInline))