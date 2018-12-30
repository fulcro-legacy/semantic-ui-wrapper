(ns fulcrologic.semantic-ui.views.card.ui-card-description
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Card/CardDescription" :default CardDescription]))

  (def ui-card-description
  "A card can contain a description with one or more paragraphs.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card content can adjust its text alignment. (left, center, right)"
   (h/factory-apply CardDescription))
