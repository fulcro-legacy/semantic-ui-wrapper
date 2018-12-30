(ns fulcrologic.semantic-ui.addons.textarea.ui-text-area
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/TextArea/TextArea" :default TextArea]))

  (def ui-text-area
  "A TextArea can be used to allow for extended user input.

  Props:
    - as (custom): An element type to render as (string or function).
    - autoHeight (bool): Indicates whether height of the textarea fits the content or not.
    - onChange (func): Called on change.
    - onInput (func): Called on input.
    - rows (number|string): Indicates row count for a TextArea. ()
    - style (object): Custom TextArea style.
    - value (number|string): The value of the textarea. ()"
   (h/wrapped-factory-apply TextArea))
