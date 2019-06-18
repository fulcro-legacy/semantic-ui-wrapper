(ns fulcrologic.semantic-ui.elements.reveal.ui-reveal
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Reveal/Reveal" :default Reveal]))

  (def ui-reveal
  "A reveal displays additional content in place of previous content when activated.

  Props:
    - active (bool): An active reveal displays its hidden content.
    - animated (enum): An animation name that will be applied to Reveal. (fade, small fade, move, move right, move up, move down, rotate, rotate left)
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A disabled reveal will not animate when hovered.
    - instant (bool): An element can show its content without delay."
   (h/factory-apply Reveal))
