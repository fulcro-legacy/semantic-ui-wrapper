(ns fulcrologic.semantic-ui.views.comment.ui-comment-actions
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Comment/CommentActions" :default CommentActions]))

  (def ui-comment-actions
  "A comment can contain an list of actions a user may perform related to this comment.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply CommentActions))
