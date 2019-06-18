(ns com.fulcrologic.semantic-ui.views.card.ui-card-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Card/CardContent" :default CardContent]))

  (def ui-card-content
  "A card can contain blocks of content or extra content meant to be formatted separately from the main content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for CardDescription.
    - extra (bool): A card can contain extra content meant to be formatted separately from the main content.
    - header (custom): Shorthand for CardHeader.
    - meta (custom): Shorthand for CardMeta.
    - textAlign (enum): A card content can adjust its text alignment. (left, center, right)"
   (h/factory-apply CardContent))
