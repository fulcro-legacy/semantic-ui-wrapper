(ns fulcrologic.semantic-ui.elements.image.ui-image-group
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Image/ImageGroup" :default ImageGroup]))

  (def ui-image-group
  "A group of images.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - size (enum): A group of images can be formatted to have the same size. (mini, tiny, small, medium, large, big, huge, massive)"
   (h/factory-apply ImageGroup))
