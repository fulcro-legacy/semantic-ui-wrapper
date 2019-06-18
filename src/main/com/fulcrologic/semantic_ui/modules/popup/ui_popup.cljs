(ns com.fulcrologic.semantic-ui.modules.popup.ui-popup
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Popup/Popup" :default Popup]))

  (def ui-popup
  "A Popup displays additional information on top of a page.

  Props:
    - as (custom): An element type to render as (string or function).
    - basic (bool): Display the popup without the pointing arrow.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Simple text content for the popover.
    - context (object): Existing element the pop-up should be bound to.
    - flowing (bool): A flowing Popup has no maximum width and continues to flow to fit its content.
    - header (custom): Header displayed above the content in bold.
    - hideOnScroll (bool): Hide the Popup when scrolling the window.
    - horizontalOffset (number): Horizontal offset in pixels to be applied to the Popup.
    - hoverable (bool): Whether the popup should not close on hover.
    - inverted (bool): Invert the colors of the Popup.
    - keepInViewPort (bool): Element to be rendered within the confines of the viewport whenever possible.
    - on (enum|arrayOf): Events triggering the popup. (hover, click, focus)
    - onClose (func): Called when a close event happens.
    - onMount (func): Called when the portal is mounted on the DOM.
    - onOpen (func): Called when an open event happens.
    - onUnmount (func): Called when the portal is unmounted from the DOM.
    - position (enum): Position for the popover. (top left, top right, bottom right, bottom left, right center, left center, top center, bottom center)
    - size (enum): Popup size. (mini, tiny, small, large, huge)
    - style (object): Custom Popup style.
    - trigger (node): Element to be rendered in-place where the popup is defined.
    - verticalOffset (number): Vertical offset in pixels to be applied to the Popup.
    - wide (bool|enum): Popup width. (very)"
   (h/factory-apply Popup))
