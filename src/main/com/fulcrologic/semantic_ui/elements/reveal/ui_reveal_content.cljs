(ns fulcrologic.semantic-ui.elements.reveal.ui-reveal-content
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Reveal/RevealContent" :default RevealContent]))

  (def ui-reveal-content
  "A content sub-component for the Reveal.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - hidden (bool): A reveal may contain content that is visible before interaction.
    - visible (bool): A reveal may contain content that is hidden before user interaction."
   (h/factory-apply RevealContent))
