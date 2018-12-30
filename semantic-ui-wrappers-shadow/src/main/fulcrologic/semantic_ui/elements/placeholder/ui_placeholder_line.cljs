(ns fulcrologic.semantic-ui.elements.placeholder.ui-placeholder-line
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderLine" :default PlaceholderLine]))

  (def ui-placeholder-line
  "A placeholder can contain have lines of text.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - length (enum): A line can specify how long its contents should appear. (full, very long, long, medium, short, very short)"
   (h/factory-apply PlaceholderLine))
