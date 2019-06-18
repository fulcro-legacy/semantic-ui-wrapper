(ns fulcrologic.semantic-ui.views.card.ui-card
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Card/Card" :default Card]))

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
