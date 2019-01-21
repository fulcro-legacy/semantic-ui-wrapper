(ns fulcrologic.semantic-ui.elements.step.ui-step-title
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Step/StepTitle" :default StepTitle]))

  (def ui-step-title
  "A step can contain a title.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply StepTitle))
