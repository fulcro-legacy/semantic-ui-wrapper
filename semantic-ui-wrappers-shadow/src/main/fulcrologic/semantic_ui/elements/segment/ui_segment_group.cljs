(ns fulcrologic.semantic-ui.elements.segment.ui-segment-group
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Segment/SegmentGroup" :default SegmentGroup]))

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
