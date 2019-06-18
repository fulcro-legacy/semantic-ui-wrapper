(ns fulcrologic.semantic-ui.modules.popup.ui-popup-content
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Popup/PopupContent" :default PopupContent]))

  (def ui-popup-content
  "A PopupContent displays the content body of a Popover.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): The content of the Popup
    - className (string): Classes to add to the Popup content className.
    - content (custom): Shorthand for primary content."
   (h/factory-apply PopupContent))
