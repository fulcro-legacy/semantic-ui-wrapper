(ns com.fulcrologic.semantic-ui.modules.transition.ui-transition-group
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Transition/TransitionGroup" :default TransitionGroup]))

  (def ui-transition-group
  "A Transition.Group animates children as they mount and unmount.

  Props:
    - animation (enum): Named animation event to used. Must be defined in CSS. (browse, browse right, drop, fade, fade up, fade down, fade left, fade right, fly up, fly down, fly left, fly right, horizontal flip, vertical flip, scale, slide up, slide down, slide left, slide right, swing up, swing down, swing left, swing right, zoom, jiggle, flash, shake, pulse, tada, bounce, glow)
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - duration (number|shape|string): Duration of the CSS transition animation in milliseconds. ()"
   (h/factory-apply TransitionGroup))
