(ns fulcrologic.semantic-ui.modules.ui-breadcrumb
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Breadcrumb BreadcrumbSection BreadcrumbDivider]]))

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

(def ui-breadcrumb-divider
  "A divider sub-component for Breadcrumb component.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): Render as an `Icon` component with `divider` class instead of a `div`."
   (h/factory-apply BreadcrumbDivider))