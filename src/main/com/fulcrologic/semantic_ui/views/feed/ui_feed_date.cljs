(ns fulcrologic.semantic-ui.views.feed.ui-feed-date
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Feed/FeedDate" :default FeedDate]))

  (def ui-feed-date
  "An event or an event summary can contain a date.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply FeedDate))
