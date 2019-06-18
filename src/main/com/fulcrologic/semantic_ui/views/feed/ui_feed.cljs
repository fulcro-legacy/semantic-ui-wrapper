(ns fulcrologic.semantic-ui.views.feed.ui-feed
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Feed/Feed" :default Feed]))

  (def ui-feed
  "A feed presents user activity chronologically.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - events (custom): Shorthand array of props for FeedEvent.
    - size (enum): A feed can have different sizes. (small, large)"
   (h/factory-apply Feed))
