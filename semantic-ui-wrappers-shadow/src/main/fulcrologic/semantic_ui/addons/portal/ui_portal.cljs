(ns fulcrologic.semantic-ui.addons.portal.ui-portal
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/Portal/Portal" :default Portal]))

  (def ui-portal
  "A component that allows you to render children outside their parent.

  Props:
    - children (node): Primary content.
    - closeOnDocumentClick (bool): Controls whether or not the portal should close when the document is clicked.
    - closeOnEscape (bool): Controls whether or not the portal should close when escape is pressed is displayed.
    - closeOnPortalMouseLeave (bool): Controls whether or not the portal should close when mousing out of the portal.
    - closeOnTriggerBlur (bool): Controls whether or not the portal should close on blur of the trigger.
    - closeOnTriggerClick (bool): Controls whether or not the portal should close on click of the trigger.
    - closeOnTriggerMouseLeave (bool): Controls whether or not the portal should close when mousing out of the trigger.
    - defaultOpen (bool): Initial value of open.
    - eventPool (string): Event pool namespace that is used to handle component events
    - mountNode (any): The node where the portal should mount.
    - mouseEnterDelay (number): Milliseconds to wait before opening on mouse over
    - mouseLeaveDelay (number): Milliseconds to wait before closing on mouse leave
    - onClose (func): Called when a close event happens
    - onMount (func): Called when the portal is mounted on the DOM.
    - onOpen (func): Called when an open event happens
    - onUnmount (func): Called when the portal is unmounted from the DOM.
    - open (bool): Controls whether or not the portal is displayed.
    - openOnTriggerClick (bool): Controls whether or not the portal should open when the trigger is clicked.
    - openOnTriggerFocus (bool): Controls whether or not the portal should open on focus of the trigger.
    - openOnTriggerMouseEnter (bool): Controls whether or not the portal should open when mousing over the trigger.
    - trigger (node): Element to be rendered in-place where the portal is defined.
    - triggerRef (func|object): Called with a ref to the trigger node. ()"
   (h/factory-apply Portal))
