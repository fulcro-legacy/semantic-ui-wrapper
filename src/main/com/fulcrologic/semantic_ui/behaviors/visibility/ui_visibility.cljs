(ns fulcrologic.semantic-ui.behaviors.visibility.ui-visibility
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/behaviors/Visibility/Visibility" :default Visibility]))

  (def ui-visibility
  "Visibility provides a set of callbacks for when a content appears in the viewport.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - context (object): Context which visibility should attach onscroll events.
    - continuous (bool): When set to true a callback will occur anytime an element passes a condition not just immediately after the
    - fireOnMount (bool): Fires callbacks immediately after mount.
    - offset (number|string|arrayOf): Value that context should be adjusted in pixels. Useful for making content appear below content fixed to the ()
    - onBottomPassed (func): Element's bottom edge has passed top of screen.
    - onBottomPassedReverse (func): Element's bottom edge has not passed top of screen.
    - onBottomVisible (func): Element's bottom edge has passed bottom of screen
    - onBottomVisibleReverse (func): Element's bottom edge has not passed bottom of screen.
    - onOffScreen (func): Element is not visible on the screen.
    - onOnScreen (func): Element is visible on the screen.
    - onPassed (object): Element is not visible on the screen.
    - onPassing (func): Any part of an element is visible on screen.
    - onPassingReverse (func): Element's top has not passed top of screen but bottom has.
    - onTopPassed (func): Element's top edge has passed top of the screen.
    - onTopPassedReverse (func): Element's top edge has not passed top of the screen.
    - onTopVisible (func): Element's top edge has passed bottom of screen.
    - onTopVisibleReverse (func): Element's top edge has not passed bottom of screen.
    - onUpdate (func): Element's top edge has passed bottom of screen.
    - once (bool): When set to false a callback will occur each time an element passes the threshold for a condition.
    - updateOn (enum): Allows to choose the mode of the position calculations: (events, repaint)"
   (h/factory-apply Visibility))
