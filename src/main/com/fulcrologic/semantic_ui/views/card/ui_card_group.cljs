(ns com.fulcrologic.semantic-ui.views.card.ui-card-group
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Card/CardGroup" :default CardGroup]))

  (def ui-card-group
  "A group of cards.

  Props:
    - as (custom): An element type to render as (string or function).
    - centered (bool): A group of cards can center itself inside its container.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - doubling (bool): A group of cards can double its column width for mobile.
    - items (custom): Shorthand array of props for Card.
    - itemsPerRow (enum): A group of cards can set how many cards should exist in a row. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - stackable (bool): A group of cards can automatically stack rows to a single columns on mobile devices.
    - textAlign (enum): A card group can adjust its text alignment. (left, center, right)"
   (h/factory-apply CardGroup))
