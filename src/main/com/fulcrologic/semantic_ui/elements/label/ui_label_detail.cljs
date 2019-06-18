(ns com.fulcrologic.semantic-ui.elements.label.ui-label-detail
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Label/LabelDetail" :default LabelDetail]))

  (def ui-label-detail
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply LabelDetail))
