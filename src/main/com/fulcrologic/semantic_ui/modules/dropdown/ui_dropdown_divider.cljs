(ns com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-divider
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownDivider" :default DropdownDivider]))

  (def ui-dropdown-divider
  "A dropdown menu can contain dividers to separate related content.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes."
   (h/factory-apply DropdownDivider))
