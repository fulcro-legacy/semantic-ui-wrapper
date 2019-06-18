(ns com.fulcrologic.semantic-ui.views.feed.ui-feed-event
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Feed/FeedEvent" :default FeedEvent]))

  (def ui-feed-event
  "A feed contains an event.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for FeedContent.
    - date (custom): Shorthand for FeedDate.
    - extraImages (custom): Shorthand for FeedExtra with images.
    - extraText (custom): Shorthand for FeedExtra with content.
    - icon (custom): An event can contain icon label.
    - image (custom): An event can contain image label.
    - meta (custom): Shorthand for FeedMeta.
    - summary (custom): Shorthand for FeedSummary."
   (h/factory-apply FeedEvent))
