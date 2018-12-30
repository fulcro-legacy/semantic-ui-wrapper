(ns fulcrologic.semantic-ui.collections.message.ui-message
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Message/Message" :default Message]))

  (def ui-message
  "A message displays information that explains nearby content.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): A message can be formatted to attach itself to other content. (bottom, top)
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A message can be formatted to be different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - compact (bool): A message can only take up the width of its content.
    - content (custom): Shorthand for primary content.
    - error (bool): A message may be formatted to display a negative message. Same as `negative`.
    - floating (bool): A message can float above content that it is related to.
    - header (custom): Shorthand for MessageHeader.
    - hidden (bool): A message can be hidden.
    - icon (custom|bool): A message can contain an icon. ()
    - info (bool): A message may be formatted to display information.
    - list (custom): Array shorthand items for the MessageList. Mutually exclusive with children.
    - negative (bool): A message may be formatted to display a negative message. Same as `error`.
    - onDismiss (func): A message that the user can choose to hide.
    - positive (bool): A message may be formatted to display a positive message.  Same as `success`.
    - size (enum): A message can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - success (bool): A message may be formatted to display a positive message.  Same as `positive`.
    - visible (bool): A message can be set to visible to force itself to be shown.
    - warning (bool): A message may be formatted to display warning messages."
   (h/factory-apply Message))
