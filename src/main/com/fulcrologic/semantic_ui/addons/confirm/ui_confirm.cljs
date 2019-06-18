(ns com.fulcrologic.semantic-ui.addons.confirm.ui-confirm
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/Confirm/Confirm" :default Confirm]))

  (def ui-confirm
  "A Confirm modal gives the user a choice to confirm or cancel an action/

  Props:
    - cancelButton (custom): The cancel button text.
    - confirmButton (custom): The OK button text.
    - content (custom): The ModalContent text.
    - header (custom): The ModalHeader text.
    - onCancel (func): Called when the Modal is closed without clicking confirm.
    - onConfirm (func): Called when the OK button is clicked.
    - open (bool): Whether or not the modal is visible.
    - size (enum): A Confirm can vary in size (mini, tiny, small, large, fullscreen)"
   (h/factory-apply Confirm))
