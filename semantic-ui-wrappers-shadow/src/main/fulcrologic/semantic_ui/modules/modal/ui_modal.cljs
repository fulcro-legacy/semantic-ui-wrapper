(ns fulcrologic.semantic-ui.modules.modal.ui-modal
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Modal/Modal" :default Modal]))

  (def ui-modal
  "A modal displays content that temporarily blocks interactions with the main view of a site.

  Props:
    - actions (custom): Shorthand for Modal.Actions. Typically an array of button shorthand.
    - as (custom): An element type to render as (string or function).
    - basic (bool): A modal can reduce its complexity
    - centered (bool): A modal can be vertically centered in the viewport
    - children (node): Primary content.
    - className (string): Additional classes.
    - closeIcon (node|object|bool): Shorthand for the close icon. Closes the modal on click. ()
    - closeOnDimmerClick (bool): Whether or not the Modal should close when the dimmer is clicked.
    - closeOnDocumentClick (bool): Whether or not the Modal should close when the document is clicked.
    - content (custom): Simple text content for the Modal.
    - defaultOpen (bool): Initial value of open.
    - dimmer (enum): A Modal can appear in a dimmer. (true, inverted, blurring)
    - eventPool (string): Event pool namespace that is used to handle component events
    - header (custom): Modal displayed above the content in bold.
    - mountNode (any): The node where the modal should mount. Defaults to document.body.
    - onActionClick (func): Action onClick handler when using shorthand `actions`.
    - onClose (func): Called when a close event happens.
    - onMount (func): Called when the portal is mounted on the DOM.
    - onOpen (func): Called when an open event happens.
    - onUnmount (func): Called when the portal is unmounted from the DOM.
    - open (bool): Controls whether or not the Modal is displayed.
    - size (enum): A modal can vary in size (mini, tiny, small, large, fullscreen)
    - style (object): Custom styles.
    - trigger (node): Element to be rendered in-place where the portal is defined."
   (h/factory-apply Modal))
