(ns fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-search-input
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownSearchInput" :default DropdownSearchInput]))

  (def ui-dropdown-search-input
  "A search item sub-component for Dropdown component.

  Props:
    - as (custom): An element type to render as (string or function).
    - autoComplete (string): An input can have the auto complete.
    - className (string): Additional classes.
    - inputRef (func|object): A ref handler for input. ()
    - tabIndex (number|string): An input can receive focus. ()
    - type (string): The HTML input type.
    - value (number|string): Stored value. ()"
   (h/wrapped-factory-apply DropdownSearchInput))
