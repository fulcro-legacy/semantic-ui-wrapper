(ns com.fulcrologic.semantic-ui.views.feed.ui-feed-meta
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Feed/FeedMeta" :default FeedMeta]))

  (def ui-feed-meta
  "A feed can contain a meta.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - like (custom): Shorthand for FeedLike."
   (h/factory-apply FeedMeta))
