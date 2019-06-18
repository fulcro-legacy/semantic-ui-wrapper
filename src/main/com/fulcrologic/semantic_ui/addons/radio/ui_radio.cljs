(ns fulcrologic.semantic-ui.addons.radio.ui-radio
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/Radio/Radio" :default Radio]))

  (def ui-radio
  "A Radio is sugar for <Checkbox radio />.
  Useful for exclusive groups of sliders or toggles.

  Props:
    - slider (custom): Format to emphasize the current selection state.
    - toggle (custom): Format to show an on or off choice.
    - type (custom): HTML input type, either checkbox or radio."
   (h/factory-apply Radio))
