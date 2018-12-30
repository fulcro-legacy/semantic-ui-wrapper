(ns fulcrologic.semantic-ui.modules.modal.ui-modal-header
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Modal/ModalHeader" :default ModalHeader]))

  (def ui-modal-header
  "A modal can have a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ModalHeader))
