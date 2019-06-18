(ns com.fulcrologic.semantic-ui.elements.placeholder.ui-placeholder
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Placeholder/Placeholder" :default Placeholder]))

  (def ui-placeholder
  "A placeholder is used to reserve splace for content that soon will appear in a layout.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fluid (bool): A fluid placeholder takes up the width of its container.
    - inverted (bool): A placeholder can have their colors inverted."
   (h/factory-apply Placeholder))
