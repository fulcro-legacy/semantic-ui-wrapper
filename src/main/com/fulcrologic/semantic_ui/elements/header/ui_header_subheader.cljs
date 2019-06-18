(ns fulcrologic.semantic-ui.elements.header.ui-header-subheader
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Header/HeaderSubheader" :default HeaderSubheader]))

  (def ui-header-subheader
  "Headers may contain subheaders.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply HeaderSubheader))
