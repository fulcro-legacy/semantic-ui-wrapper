(ns fulcrologic.semantic-ui.collections.message.ui-message-list
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Message/MessageList" :default MessageList]))

  (def ui-message-list
  "A message can contain a list of items.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - items (custom): Shorthand Message.Items."
   (h/factory-apply MessageList))
