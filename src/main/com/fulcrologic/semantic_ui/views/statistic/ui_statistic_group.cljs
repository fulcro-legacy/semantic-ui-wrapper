(ns fulcrologic.semantic-ui.views.statistic.ui-statistic-group
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Statistic/StatisticGroup" :default StatisticGroup]))

  (def ui-statistic-group
  "A group of statistics.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A statistic group can be formatted to be different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - horizontal (bool): A statistic group can present its measurement horizontally.
    - inverted (bool): A statistic group can be formatted to fit on a dark background.
    - items (custom): Array of props for Statistic.
    - size (enum): A statistic group can vary in size. (mini, tiny, small, large, huge)
    - widths (enum): A statistic group can have its items divided evenly. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
   (h/factory-apply StatisticGroup))
