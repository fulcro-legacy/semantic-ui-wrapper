(ns fulcrologic.semantic-ui.elements.step.ui-step
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Step/Step" :default Step]))

  (def ui-step
  "A step shows the completion status of an activity in a series of activities.

  Props:
    - active (bool): A step can be highlighted as active.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - completed (bool): A step can show that a user has completed it.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for StepDescription.
    - disabled (bool): Show that the Loader is inactive.
    - href (string): Render as an `a` tag instead of a `div` and adds the href attribute.
    - icon (custom): Shorthand for Icon.
    - link (bool): A step can be link.
    - onClick (func): Called on click. When passed, the component will render as an `a`
    - ordered (bool): A step can show a ordered sequence of steps. Passed from StepGroup.
    - title (custom): Shorthand for StepTitle."
   (h/factory-apply Step))
