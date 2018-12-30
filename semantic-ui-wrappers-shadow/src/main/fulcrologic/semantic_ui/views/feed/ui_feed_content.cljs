(ns fulcrologic.semantic-ui.views.feed.ui-feed-content
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Feed/FeedContent" :default FeedContent]))

  (def ui-feed-content
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - date (custom): An event can contain a date.
    - extraImages (custom): Shorthand for FeedExtra with images.
    - extraText (custom): Shorthand for FeedExtra with text.
    - meta (custom): Shorthand for FeedMeta.
    - summary (custom): Shorthand for FeedSummary."
   (h/factory-apply FeedContent))
