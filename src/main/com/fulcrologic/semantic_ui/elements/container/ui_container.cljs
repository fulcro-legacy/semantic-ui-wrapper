(ns fulcrologic.semantic-ui.elements.container.ui-container
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Container/Container" :default Container]))

  (def ui-container
  "A container limits content to a maximum width.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fluid (bool): Container has no maximum width.
    - text (bool): Reduce maximum width to more naturally accommodate text.
    - textAlign (enum): Align container text. (left, center, right, justified)"
   (h/factory-apply Container))
