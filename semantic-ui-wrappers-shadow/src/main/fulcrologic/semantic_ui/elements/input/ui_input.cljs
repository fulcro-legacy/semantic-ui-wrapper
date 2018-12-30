(ns fulcrologic.semantic-ui.elements.input.ui-input
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Input/Input" :default Input]))

  (def ui-input
  "An Input is a field used to elicit a response from a user.

  Props:
    - action (bool|custom): An Input can be formatted to alert the user to an action they may perform. ()
    - actionPosition (enum): An action can appear along side an Input on the left or right. (left)
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - disabled (bool): An Input field can show that it is disabled.
    - error (bool): An Input field can show the data contains errors.
    - fluid (bool): Take on the size of its container.
    - focus (bool): An Input field can show a user is currently interacting with it.
    - icon (bool|custom): Optional Icon to display inside the Input. ()
    - iconPosition (enum): An Icon can appear inside an Input on the left or right. (left)
    - input (custom): Shorthand for creating the HTML Input.
    - inverted (bool): Format to appear on dark backgrounds.
    - label (custom): Optional Label to display along side the Input.
    - labelPosition (enum): A Label can appear outside an Input on the left or right. (left, right, left corner, right corner)
    - loading (bool): An Icon Input field can show that it is currently loading data.
    - onChange (func): Called on change.
    - size (enum): An Input can vary in size. (mini, tiny, small, medium, large, big, huge, massive)
    - tabIndex (number|string): An Input can receive focus. ()
    - transparent (bool): Transparent Input has no background.
    - type (string): The HTML input type."
   (h/wrapped-factory-apply Input))
