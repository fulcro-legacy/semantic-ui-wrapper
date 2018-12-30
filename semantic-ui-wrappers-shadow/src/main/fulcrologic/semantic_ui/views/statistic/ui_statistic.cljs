(ns fulcrologic.semantic-ui.views.statistic.ui-statistic
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Statistic/Statistic" :default Statistic]))

  (def ui-statistic
  "A statistic emphasizes the current value of an attribute.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A statistic can be formatted to be different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - floated (enum): A statistic can sit to the left or right of other content. (left, right)
    - horizontal (bool): A statistic can present its measurement horizontally.
    - inverted (bool): A statistic can be formatted to fit on a dark background.
    - label (custom): Label content of the Statistic.
    - size (enum): A statistic can vary in size. (mini, tiny, small, large, huge)
    - text (bool): Format the StatisticValue with smaller font size to fit nicely beside number values.
    - value (custom): Value content of the Statistic."
   (h/factory-apply Statistic))
