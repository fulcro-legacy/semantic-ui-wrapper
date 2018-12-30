(ns fulcrologic.semantic-ui.modules.ui-card
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Card CardContent CardGroup CardDescription CardHeader CardMeta]]))

(def ui-card
  "A card displays site content in a manner similar to a playing card.

  Props:
    - as (custom): An element type to render as (string or function).
    - centered (bool): A Card can center itself inside its container.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A Card can be formatted to display different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for CardDescription.
    - extra (custom): Shorthand for primary content of CardContent.
    - fluid (bool): A Card can be formatted to take up the width of its container.
    - header (custom): Shorthand for CardHeader.
    - href (string): Render as an `a` tag instead of a `div` and adds the href attribute.
    - image (custom): A card can contain an Image component.
    - link (bool): A card can be formatted to link to other content.
    - meta (custom): Shorthand for CardMeta.
    - onClick (func): Called on click. When passed, the component renders as an `a`
    - raised (bool): A Card can be formatted to raise above the page."
   (h/factory-apply Card))

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

(def ui-card-description
  "A card can contain a description with one or more paragraphs.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card content can adjust its text alignment. (left, center, right)"
   (h/factory-apply CardDescription))

(def ui-card-header
  "A card can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card header can adjust its text alignment. (left, center, right)"
   (h/factory-apply CardHeader))

(def ui-card-meta
  "A card can contain content metadata.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card meta can adjust its text alignment. (left, center, right)"
   (h/factory-apply CardMeta))