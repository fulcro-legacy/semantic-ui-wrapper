(ns fulcrologic.semantic-ui.modules.ui-step
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Step StepTitle StepContent StepDescription StepGroup]]))

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

(def ui-step-title
  "A step can contain a title.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply StepTitle))

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

(def ui-step-description
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply StepDescription))

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