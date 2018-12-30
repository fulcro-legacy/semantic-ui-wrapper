(ns fulcrologic.semantic-ui.modules.ui-sticky
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Sticky]]))

(def ui-sticky
  "Sticky content stays fixed to the browser viewport while another column of content is visible on the page.

  Props:
    - active (bool): A Sticky can be active.
    - as (custom): An element type to render as (string or function).
    - bottomOffset (number): Offset in pixels from the bottom of the screen when fixing element to viewport.
    - children (node): Primary content.
    - className (string): Additional classes.
    - context (object): Context which sticky element should stick to.
    - offset (number): Offset in pixels from the top of the screen when fixing element to viewport.
    - onBottom (func): Callback when element is bound to bottom of parent container.
    - onStick (func): Callback when element is fixed to page.
    - onTop (func): Callback when element is bound to top of parent container.
    - onUnstick (func): Callback when element is unfixed from page.
    - pushing (bool): Whether element should be \"pushed\" by the viewport, attaching to the bottom of the screen when scrolling up.
    - scrollContext (object): Context which sticky should attach onscroll events.
    - styleElement (object): Custom style for sticky element."
   (h/factory-apply Sticky))