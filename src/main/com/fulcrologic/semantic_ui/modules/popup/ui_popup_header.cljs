(ns com.fulcrologic.semantic-ui.modules.popup.ui-popup-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Popup/PopupHeader" :default PopupHeader]))

  (def ui-popup-header
  "A PopupHeader displays a header in a Popover.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply PopupHeader))
