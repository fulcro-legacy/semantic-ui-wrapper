(ns fulcrologic.semantic-ui.modules.modal.ui-modal-actions
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Modal/ModalActions" :default ModalActions]))

  (def ui-modal-actions
  "A modal can contain a row of actions.

  Props:
    - actions (custom): Array of shorthand buttons.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - onActionClick (func): Action onClick handler when using shorthand `actions`. ()"
   (h/factory-apply ModalActions))
