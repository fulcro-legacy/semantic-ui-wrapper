(ns com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-item
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownItem" :default DropdownItem]))

  (def ui-dropdown-item
  "An item sub-component for Dropdown component.

  Props:
    - active (bool): Style as the currently chosen item.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Additional text with less emphasis.
    - disabled (bool): A dropdown item can be disabled.
    - flag (custom): Shorthand for Flag.
    - icon (custom): Shorthand for Icon.
    - image (custom): Shorthand for Image.
    - label (custom): Shorthand for Label.
    - onClick (func): Called on click.
    - selected (bool): The item currently selected by keyboard shortcut.
    - text (custom): Display text.
    - value (bool|number|string): Stored value. ()"
   (h/factory-apply DropdownItem))
