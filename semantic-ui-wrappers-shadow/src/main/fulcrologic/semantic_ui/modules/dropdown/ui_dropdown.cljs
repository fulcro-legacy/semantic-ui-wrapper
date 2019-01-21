(ns fulcrologic.semantic-ui.modules.dropdown.ui-dropdown
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Dropdown/Dropdown" :default Dropdown]))

  (def ui-dropdown
  "A dropdown allows a user to select a value from a series of options.

  Props:
    - additionLabel (element|string): Label prefixed to an option added by a user. ()
    - additionPosition (enum): Position of the `Add: ...` option in the dropdown list ('top' or 'bottom'). (top, bottom)
    - allowAdditions (bool): Allow user additions to the list of options (boolean). ()
    - as (custom): An element type to render as (string or function).
    - basic (bool): A Dropdown can reduce its complexity.
    - button (bool): Format the Dropdown to appear as a button.
    - children (): Primary content. ()
    - className (string): Additional classes.
    - clearable (bool): Using the clearable setting will let users remove their selection from a dropdown.
    - closeOnBlur (bool): Whether or not the menu should close when the dropdown is blurred.
    - closeOnChange (bool): Whether or not the menu should close when a value is selected from the dropdown.
    - compact (bool): A compact dropdown has no minimum width.
    - deburr (bool): Whether or not the dropdown should strip diacritics in options and input search
    - defaultOpen (bool): Initial value of open.
    - defaultSearchQuery (string): Initial value of searchQuery.
    - defaultSelectedLabel (union): Currently selected label in multi-select. ()
    - defaultUpward (bool): Initial value of upward.
    - defaultValue (number|string|bool|arrayOf): Initial value or value array if multiple. ()
    - direction (enum): A dropdown menu can open to the left or to the right. (left, right)
    - disabled (bool): A disabled dropdown menu or item does not allow user interaction.
    - error (bool): An errored dropdown can alert a user to a problem.
    - floating (bool): A dropdown menu can contain floated content.
    - fluid (bool): A dropdown can take the full width of its parent
    - header (node): A dropdown menu can contain a header.
    - icon (node|object): Shorthand for Icon. ()
    - inline (bool): A dropdown can be formatted to appear inline in other content.
    - item (bool): A dropdown can be formatted as a Menu item.
    - labeled (bool): A dropdown can be labeled.
    - lazyLoad (bool): A dropdown can defer rendering its options until it is open.
    - loading (bool): A dropdown can show that it is currently loading data.
    - minCharacters (number): The minimum characters for a search to begin showing results.
    - multiple (bool): A selection dropdown can allow multiple selections.
    - noResultsMessage (node): Message to display when there are no results.
    - onAddItem (func): Called when a user adds a new item. Use this to update the options list.
    - onBlur (func): Called on blur.
    - onChange (func): Called when the user attempts to change the value.
    - onClick (func): Called on click.
    - onClose (func): Called when a close event happens.
    - onFocus (func): Called on focus.
    - onLabelClick (func): Called when a multi-select label is clicked.
    - onMouseDown (func): Called on mousedown.
    - onOpen (func): Called when an open event happens.
    - onSearchChange (func): Called on search input change.
    - open (bool): Controls whether or not the dropdown menu is displayed.
    - openOnFocus (bool): Whether or not the menu should open when the dropdown is focused.
    - options (arrayOf): Array of Dropdown.Item props e.g. `{ text: '', value: '' }` ()
    - placeholder (string): Placeholder text.
    - pointing (bool|enum): A dropdown can be formatted so that its menu is pointing. (left, right, top, top left, top right, bottom, bottom left, bottom right)
    - renderLabel (func): Mapped over the active items and returns shorthand for the active item Labels.
    - scrolling (bool): A dropdown can have its menu scroll.
    - search (bool|func): A selection dropdown can allow a user to search through a large list of choices. ()
    - searchInput (array|node|object): A shorthand for a search input. ()
    - searchQuery (string): Current value of searchQuery. Creates a controlled component.
    - selectOnBlur (bool): Define whether the highlighted item should be selected on blur.
    - selectOnNavigation (bool): Whether or not to change the value when navigating the menu using arrow keys.
    - selectedLabel (union): Currently selected label in multi-select. ()
    - selection (bool): A dropdown can be used to select between choices in a form. ()
    - simple (bool): A simple dropdown can open without Javascript.
    - tabIndex (number|string): A dropdown can receive focus. ()
    - text (string): The text displayed in the dropdown, usually for the active item.
    - trigger (node): Custom element to trigger the menu to become visible. Takes place of 'text'. ()
    - upward (bool): Controls whether the dropdown will open upward.
    - value (bool|string|number|arrayOf): Current value or value array if multiple. Creates a controlled component. ()
    - wrapSelection (bool): A dropdown will go to the last element when ArrowUp is pressed on the first,"
   (h/factory-apply Dropdown))
