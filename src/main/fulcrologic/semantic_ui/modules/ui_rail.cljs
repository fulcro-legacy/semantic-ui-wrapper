(ns fulcrologic.semantic-ui.modules.ui-rail
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Rail]]))

(def ui-rail
  "A rail is used to show accompanying content outside the boundaries of the main view of a site.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool): A rail can appear attached to the main viewport.
    - children (node): Primary content.
    - className (string): Additional classes.
    - close (bool|enum): A rail can appear closer to the main viewport. (very)
    - content (custom): Shorthand for primary content.
    - dividing (bool): A rail can create a division between itself and a container.
    - internal (bool): A rail can attach itself to the inside of a container.
    - position (enum): A rail can be presented on the left or right side of a container. (left, right)
    - size (enum): A rail can have different sizes. (mini, tiny, small, large, big, huge, massive)"
   (h/factory-apply Rail))