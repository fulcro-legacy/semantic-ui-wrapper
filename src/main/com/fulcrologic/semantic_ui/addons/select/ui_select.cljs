(ns com.fulcrologic.semantic-ui.addons.select.ui-select
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/Select/Select" :default Select]))

  (def ui-select
  "A Select is sugar for <Dropdown selection />.

  Props:
    - options (arrayOf): Array of Dropdown.Item props e.g. `{ text: '', value: '' }` ([:name \"shape\"], [:value \"Dropdown.Item.propTypes\"], [:computed true])"
   (h/factory-apply Select))
