(ns fulcrologic.semantic-ui.elements.step.ui-step-description
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Step/StepDescription" :default StepDescription]))

  (def ui-step-description
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply StepDescription))
