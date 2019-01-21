(ns fulcrologic.semantic-ui.views.comment.ui-comment-avatar
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Comment/CommentAvatar" :default CommentAvatar]))

  (def ui-comment-avatar
  "A comment can contain an image or avatar.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - src (string): Specifies the URL of the image."
   (h/factory-apply CommentAvatar))
