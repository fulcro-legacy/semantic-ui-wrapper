(ns fulcrologic.semantic-ui.addons.responsive.ui-responsive
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/Responsive/Responsive" :default Responsive]))

  (def ui-responsive
  "Responsive can control visibility of content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - fireOnMount (bool): Fires callbacks immediately after mount.
    - getWidth (func): Called to get width of screen. Defaults to using `window.innerWidth` when in a browser;
    - maxWidth (number|string): The maximum width at which content will be displayed. ()
    - minWidth (number|string): The minimum width at which content will be displayed. ()
    - onUpdate (func): Called on update."
   (h/factory-apply Responsive))
