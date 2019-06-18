(ns com.fulcrologic.semantic-ui.collections.message.ui-message-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Message/MessageHeader" :default MessageHeader]))

  (def ui-message-header
  "A message can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply MessageHeader))
