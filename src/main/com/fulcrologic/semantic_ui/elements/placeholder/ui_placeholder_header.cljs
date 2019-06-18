(ns fulcrologic.semantic-ui.elements.placeholder.ui-placeholder-header
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderHeader" :default PlaceholderHeader]))

  (def ui-placeholder-header
  "A placeholder can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - image (bool): A placeholder can contain an image."
   (h/factory-apply PlaceholderHeader))
