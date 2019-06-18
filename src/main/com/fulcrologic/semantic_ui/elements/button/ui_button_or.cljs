(ns com.fulcrologic.semantic-ui.elements.button.ui-button-or
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Button/ButtonOr" :default ButtonOr]))

  (def ui-button-or
  "Button groups can contain conditionals.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - text (number|string): Or buttons can have their text localized, or adjusted by using the text prop. ()"
   (h/factory-apply ButtonOr))
