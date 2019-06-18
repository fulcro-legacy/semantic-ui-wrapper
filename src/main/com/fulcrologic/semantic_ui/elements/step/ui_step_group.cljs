(ns com.fulcrologic.semantic-ui.elements.step.ui-step-group
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Step/StepGroup" :default StepGroup]))

  (def ui-step-group
  "A set of steps.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Steps can be attached to other elements. (top, bottom)
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fluid (bool): A fluid step takes up the width of its container.
    - items (custom): Shorthand array of props for Step.
    - ordered (bool): A step can show a ordered sequence of steps.
    - size (enum): Steps can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - stackable (enum): A step can stack vertically only on smaller screens. (tablet)
    - unstackable (bool): A step can prevent itself from stacking on mobile.
    - vertical (bool): A step can be displayed stacked vertically.
    - widths (enum): Steps can be divided evenly inside their parent. (..._.keys(numberMap), ..._.keys(numberMap).map(Number), ..._.values(numberMap))"
   (h/factory-apply StepGroup))
