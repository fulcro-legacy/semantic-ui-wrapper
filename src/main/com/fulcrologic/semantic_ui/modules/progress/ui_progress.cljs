(ns com.fulcrologic.semantic-ui.modules.progress.ui-progress
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Progress/Progress" :default Progress]))

  (def ui-progress
  "A progress bar shows the progression of a task.

  Props:
    - active (bool): A progress bar can show activity.
    - as (custom): An element type to render as (string or function).
    - attached (enum): A progress bar can attach to and show the progress of an element (i.e. Card or Segment). (top, bottom)
    - autoSuccess (bool): Whether success state should automatically trigger when progress completes.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A progress bar can have different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - disabled (bool): A progress bar be disabled.
    - error (bool): A progress bar can show a error state.
    - indicating (bool): An indicating progress bar visually indicates the current level of progress of a task.
    - inverted (bool): A progress bar can have its colors inverted.
    - label (custom): Can be set to either to display progress as percent or ratio.
    - percent (union): Current percent complete. ()
    - precision (number): Decimal point precision for calculated progress.
    - progress (bool|enum): A progress bar can contain a text value indicating current progress. (percent, ratio, value)
    - size (enum): A progress bar can vary in size. (tiny, small, medium, large, big)
    - success (bool): A progress bar can show a success state.
    - total (union): For use with value. Together, these will calculate the percent. Mutually excludes percent. ()
    - value (union): For use with total. Together, these will calculate the percent. Mutually excludes percent. ()
    - warning (bool): A progress bar can show a warning state."
   (h/factory-apply Progress))
