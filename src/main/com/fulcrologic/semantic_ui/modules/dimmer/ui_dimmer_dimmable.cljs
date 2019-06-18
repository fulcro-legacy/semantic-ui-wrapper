(ns com.fulcrologic.semantic-ui.modules.dimmer.ui-dimmer-dimmable
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Dimmer/DimmerDimmable" :default DimmerDimmable]))

  (def ui-dimmer-dimmable
  "A dimmable sub-component for Dimmer.

  Props:
    - as (custom): An element type to render as (string or function).
    - blurring (bool): A dimmable element can blur its contents.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - dimmed (bool): Controls whether or not the dim is displayed."
   (h/factory-apply DimmerDimmable))
