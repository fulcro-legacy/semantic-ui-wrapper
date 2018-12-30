(ns fulcrologic.semantic-ui.modules.ui-feed
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Feed FeedDate FeedContent FeedExtra FeedEvent FeedLike FeedMeta FeedLabel FeedSummary FeedUser]]))

(def ui-feed
  "A feed presents user activity chronologically.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - events (custom): Shorthand array of props for FeedEvent.
    - size (enum): A feed can have different sizes. (small, large)"
   (h/factory-apply Feed))

(def ui-feed-date
  "An event or an event summary can contain a date.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply FeedDate))

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

(def ui-feed-extra
  "A feed can contain an extra content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - images (union): An event can contain additional information like a set of images. ()
    - text (bool): An event can contain additional text information."
   (h/factory-apply FeedExtra))

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

(def ui-feed-like
  "A feed can contain a like element.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): Shorthand for icon. Mutually exclusive with children."
   (h/factory-apply FeedLike))

(def ui-feed-meta
  "A feed can contain a meta.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - like (custom): Shorthand for FeedLike."
   (h/factory-apply FeedMeta))

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

(def ui-feed-summary
  "A feed can contain a summary.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - date (custom): Shorthand for FeedDate.
    - user (custom): Shorthand for FeedUser."
   (h/factory-apply FeedSummary))

(def ui-feed-user
  "A feed can contain a user element.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply FeedUser))