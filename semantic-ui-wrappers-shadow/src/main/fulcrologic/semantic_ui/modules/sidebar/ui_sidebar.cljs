(ns fulcrologic.semantic-ui.modules.sidebar.ui-sidebar
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Sidebar/Sidebar" :default Sidebar]))

  (def ui-sidebar
  "A sidebar hides additional content beside a page.

  Props:
    - animation (enum): Animation style. (overlay, push, scale down, uncover, slide out, slide along)
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - direction (enum): Direction the sidebar should appear on. (top, right, bottom, left)
    - onHidden (func): Called after a sidebar has finished animating out.
    - onHide (func): Called before a sidebar begins to animate out.
    - onShow (func): Called when a sidebar has finished animating in.
    - onVisible (func): Called when a sidebar begins animating in.
    - target (object): A sidebar can handle clicks on the passed element.
    - visible (bool): Controls whether or not the sidebar is visible on the page.
    - width (enum): Sidebar width. (very thin, thin, wide, very wide)"
   (h/factory-apply Sidebar))
