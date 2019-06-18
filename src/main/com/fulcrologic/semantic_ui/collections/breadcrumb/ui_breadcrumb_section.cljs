(ns com.fulcrologic.semantic-ui.collections.breadcrumb.ui-breadcrumb-section
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Breadcrumb/BreadcrumbSection" :default BreadcrumbSection]))

  (def ui-breadcrumb-section
  "A section sub-component for Breadcrumb component.

  Props:
    - active (bool): Style as the currently active section.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - href (string): Render as an `a` tag instead of a `div` and adds the href attribute. ()
    - link (bool): Render as an `a` tag instead of a `div`. ()
    - onClick (func): Called on click. When passed, the component will render as an `a`"
   (h/factory-apply BreadcrumbSection))
