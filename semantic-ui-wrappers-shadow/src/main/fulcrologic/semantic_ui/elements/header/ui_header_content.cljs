(ns fulcrologic.semantic-ui.elements.header.ui-header-content
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Header/HeaderContent" :default HeaderContent]))

  (def ui-header-content
  "Header content wraps the main content when there is an adjacent Icon or Image.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply HeaderContent))
