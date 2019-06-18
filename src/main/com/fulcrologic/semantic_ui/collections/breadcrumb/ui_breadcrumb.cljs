(ns com.fulcrologic.semantic-ui.collections.breadcrumb.ui-breadcrumb
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Breadcrumb/Breadcrumb" :default Breadcrumb]))

  (def ui-breadcrumb
  "A breadcrumb is used to show hierarchy between content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - divider (custom): Shorthand for primary content of the Breadcrumb.Divider. ()
    - icon (custom): For use with the sections prop. Render as an `Icon` component with `divider` class instead of a `div` in ()
    - sections (custom): Shorthand array of props for Breadcrumb.Section.
    - size (enum): Size of Breadcrumb. (mini, tiny, small, large, big, huge, massive)"
   (h/factory-apply Breadcrumb))
