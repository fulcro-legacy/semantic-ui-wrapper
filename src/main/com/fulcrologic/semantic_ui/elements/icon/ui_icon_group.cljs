(ns fulcrologic.semantic-ui.elements.icon.ui-icon-group
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Icon/IconGroup" :default IconGroup]))

  (def ui-icon-group
  "Several icons can be used together as a group.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - size (enum): Size of the icon group. (mini, tiny, small, large, big, huge, massive)"
   (h/factory-apply IconGroup))
