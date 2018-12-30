(ns fulcrologic.semantic-ui.modules.ui-comment
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Comment CommentText CommentContent CommentAction CommentAuthor CommentGroup CommentAvatar CommentActions CommentMetadata]]))

(def ui-comment
  "A comment displays user feedback to site content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsed (bool): Comment can be collapsed, or hidden from view.
    - content (custom): Shorthand for primary content."
   (h/factory-apply Comment))

(def ui-comment-text
  "A comment can contain text.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply CommentText))

(def ui-comment-content
  "A comment can contain content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply CommentContent))

(def ui-comment-action
  "A comment can contain an action.

  Props:
    - active (bool): Style as the currently active action.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply CommentAction))

(def ui-comment-author
  "A comment can contain an author.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply CommentAuthor))

(def ui-comment-group
  "Comments can be grouped.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsed (bool): Comments can be collapsed, or hidden from view.
    - content (custom): Shorthand for primary content.
    - minimal (bool): Comments can hide extra information unless a user shows intent to interact with a comment.
    - size (enum): Comments can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - threaded (bool): A comment list can be threaded to showing the relationship between conversations."
   (h/factory-apply CommentGroup))

(def ui-comment-avatar
  "A comment can contain an image or avatar.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - src (string): Specifies the URL of the image."
   (h/factory-apply CommentAvatar))

(def ui-comment-actions
  "A comment can contain an list of actions a user may perform related to this comment.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply CommentActions))

(def ui-comment-metadata
  "A comment can contain metadata about the comment, an arbitrary amount of metadata may be defined.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply CommentMetadata))