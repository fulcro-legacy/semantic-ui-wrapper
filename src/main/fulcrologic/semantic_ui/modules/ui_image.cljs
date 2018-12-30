(ns fulcrologic.semantic-ui.modules.ui-image
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Image ImageGroup]]))

(def ui-image
  "An image is a graphic representation of something.

  Props:
    - as (custom): An element type to render as (string or function).
    - avatar (bool): An image may be formatted to appear inline with text as an avatar.
    - bordered (bool): An image may include a border to emphasize the edges of white or transparent content.
    - centered (bool): An image can appear centered in a content block.
    - children (node): Primary content.
    - circular (bool): An image may appear circular.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - dimmer (custom): Shorthand for Dimmer.
    - disabled (bool): An image can show that it is disabled and cannot be selected.
    - floated (enum): An image can sit to the left or right of other content. (left, right)
    - fluid (bool): An image can take up the width of its container. ()
    - hidden (bool): An image can be hidden.
    - href (string): Renders the Image as an <a> tag with this href.
    - inline (bool): An image may appear inline.
    - label (custom): Shorthand for Label.
    - rounded (bool): An image may appear rounded.
    - size (enum): An image may appear at different sizes. (mini, tiny, small, medium, large, big, huge, massive)
    - spaced (bool|enum): An image can specify that it needs an additional spacing to separate it from nearby content. (left, right)
    - ui (bool): Whether or not to add the ui className.
    - verticalAlign (enum): An image can specify its vertical alignment. (bottom, middle, top)
    - wrapped (bool): An image can render wrapped in a `div.ui.image` as alternative HTML markup."
   (h/factory-apply Image))

(def ui-image-group
  "A group of images.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - size (enum): A group of images can be formatted to have the same size. (mini, tiny, small, medium, large, big, huge, massive)"
   (h/factory-apply ImageGroup))