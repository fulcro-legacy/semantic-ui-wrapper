(ns fulcrologic.semantic-ui.views.statistic.ui-statistic-value
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Statistic/StatisticValue" :default StatisticValue]))

  (def ui-statistic-value
  "A statistic can contain a numeric, icon, image, or text value.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - text (bool): Format the value with smaller font size to fit nicely beside number values."
   (h/factory-apply StatisticValue))
