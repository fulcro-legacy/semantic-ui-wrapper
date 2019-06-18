(ns fulcrologic.semantic-ui.modules.modal.ui-modal-content
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Modal/ModalContent" :default ModalContent]))

  (def ui-modal-content
  "A modal can contain content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - image (bool): A modal can contain image content.
    - scrolling (bool): A modal can use the entire size of the screen."
   (h/factory-apply ModalContent))
