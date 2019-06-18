(ns com.fulcrologic.semantic-ui.modules.dimmer.ui-dimmer-inner
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Dimmer/DimmerInner" :default DimmerInner]))

  (def ui-dimmer-inner
  "An inner element for a Dimmer.

  Props:
    - active (bool): An active dimmer will dim its parent container.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A disabled dimmer cannot be activated
    - inverted (bool): A dimmer can be formatted to have its colors inverted.
    - onClick (func): Called on click.
    - onClickOutside (func): Handles click outside Dimmer's content, but inside Dimmer area.
    - page (bool): A dimmer can be formatted to be fixed to the page.
    - simple (bool): A dimmer can be controlled with simple prop.
    - verticalAlign (enum): A dimmer can have its content top or bottom aligned. (bottom, top)"
   (h/factory-apply DimmerInner))
