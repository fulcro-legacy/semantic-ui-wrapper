(ns fulcrologic.semantic-ui.views.feed.ui-feed-label
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Feed/FeedLabel" :default FeedLabel]))

  (def ui-feed-label
  "An event can contain an image or icon label.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): An event can contain icon label.
    - image (custom): An event can contain image label."
   (h/factory-apply FeedLabel))
