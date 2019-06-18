(ns com.fulcrologic.semantic-ui.views.comment.ui-comment-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Comment/CommentContent" :default CommentContent]))

  (def ui-comment-content
  "A comment can contain content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply CommentContent))
