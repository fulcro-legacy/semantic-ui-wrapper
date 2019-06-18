(ns com.fulcrologic.semantic-ui.collections.message.ui-message-item
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Message/MessageItem" :default MessageItem]))

  (def ui-message-item
  "A message list can contain an item.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply MessageItem))
