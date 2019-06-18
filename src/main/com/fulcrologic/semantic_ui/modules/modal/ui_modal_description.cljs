(ns com.fulcrologic.semantic-ui.modules.modal.ui-modal-description
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Modal/ModalDescription" :default ModalDescription]))

  (def ui-modal-description
  "A modal can have a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ModalDescription))
