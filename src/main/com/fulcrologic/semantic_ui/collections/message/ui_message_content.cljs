(ns fulcrologic.semantic-ui.collections.message.ui-message-content
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Message/MessageContent" :default MessageContent]))

  (def ui-message-content
  "A message can contain a content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply MessageContent))
