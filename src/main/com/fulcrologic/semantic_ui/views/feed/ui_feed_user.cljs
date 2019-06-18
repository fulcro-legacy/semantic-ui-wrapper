(ns com.fulcrologic.semantic-ui.views.feed.ui-feed-user
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Feed/FeedUser" :default FeedUser]))

  (def ui-feed-user
  "A feed can contain a user element.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply FeedUser))
