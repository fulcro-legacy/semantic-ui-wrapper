(ns com.fulcrologic.semantic-ui.elements.step.ui-step-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Step/StepContent" :default StepContent]))

  (def ui-step-content
  "A step can contain a content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for StepDescription.
    - title (custom): Shorthand for StepTitle."
   (h/factory-apply StepContent))
