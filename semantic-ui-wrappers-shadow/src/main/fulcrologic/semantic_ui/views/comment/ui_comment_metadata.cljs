(ns fulcrologic.semantic-ui.views.comment.ui-comment-metadata
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Comment/CommentMetadata" :default CommentMetadata]))

  (def ui-comment-metadata
  "A comment can contain metadata about the comment, an arbitrary amount of metadata may be defined.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply CommentMetadata))
