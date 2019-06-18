(ns fulcrologic.semantic-ui.modules.rating.ui-rating
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Rating/Rating" :default Rating]))

  (def ui-rating
  "A rating indicates user interest in content.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - clearable (bool|enum): You can clear the rating by clicking on the current start rating. (auto)
    - defaultRating (number|string): The initial rating value. ()
    - disabled (bool): You can disable or enable interactive rating.  Makes a read-only rating.
    - icon (enum): A rating can use a set of star or heart icons. (star, heart)
    - maxRating (number|string): The total number of icons. ()
    - onRate (func): Called after user selects a new rating.
    - rating (number|string): The current number of active icons. ()
    - size (enum): A progress bar can vary in size. (mini, tiny, small, large, huge, massive)"
   (h/factory-apply Rating))
