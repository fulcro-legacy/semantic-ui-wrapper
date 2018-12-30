(ns fulcrologic.semantic-ui.modules.ui-checkbox
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Checkbox]]))

(def ui-checkbox
  "A checkbox allows a user to select a value from a small set of options, often binary.

  Props:
    - as (custom): An element type to render as (string or function).
    - checked (bool): Whether or not checkbox is checked.
    - className (string): Additional classes.
    - defaultChecked (bool): The initial value of checked.
    - defaultIndeterminate (bool): Whether or not checkbox is indeterminate.
    - disabled (bool): A checkbox can appear disabled and be unable to change states
    - fitted (bool): Removes padding for a label. Auto applied when there is no label.
    - id (number|string): A unique identifier. ()
    - indeterminate (bool): Whether or not checkbox is indeterminate.
    - label (custom): The text of the associated label element.
    - name (string): The HTML input name.
    - onChange (func): Called when the user attempts to change the checked state.
    - onClick (func): Called when the checkbox or label is clicked.
    - onMouseDown (func): Called when the user presses down on the mouse.
    - onMouseUp (func): Called when the user releases the mouse.
    - radio (bool): Format as a radio element. This means it is an exclusive option. ()
    - readOnly (bool): A checkbox can be read-only and unable to change states.
    - slider (bool): Format to emphasize the current selection state. ()
    - tabIndex (number|string): A checkbox can receive focus. ()
    - toggle (bool): Format to show an on or off choice. ()
    - type (enum): HTML input type, either checkbox or radio. (checkbox, radio)
    - value (string|number): The HTML input value. ()"
   (h/factory-apply Checkbox))