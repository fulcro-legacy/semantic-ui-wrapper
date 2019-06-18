(ns com.fulcrologic.semantic-ui.elements.segment.ui-segment-inline
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Segment/SegmentInline" :default SegmentInline]))

  (def ui-segment-inline
  "A placeholder segment can be inline.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply SegmentInline))
