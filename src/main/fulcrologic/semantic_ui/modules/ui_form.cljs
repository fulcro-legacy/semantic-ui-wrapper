(ns fulcrologic.semantic-ui.modules.ui-form
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Form FormGroup FormInput FormDropdown FormField FormCheckbox FormButton FormTextArea FormRadio FormSelect]]))

(def ui-form
  "A Form displays a set of related user input fields in a structured way.

  Props:
    - action (string): The HTML form action
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - error (bool): Automatically show any error Message children.
    - inverted (bool): A form can have its color inverted for contrast.
    - loading (bool): Automatically show a loading indicator.
    - onSubmit (func): The HTML form submit handler.
    - reply (bool): A comment can contain a form to reply to a comment. This may have arbitrary content.
    - size (enum): A form can vary in size. (mini, tiny, small, large, big, huge, massive)
    - success (bool): Automatically show any success Message children.
    - unstackable (bool): A form can prevent itself from stacking on mobile.
    - warning (bool): Automatically show any warning Message children.
    - widths (enum): Forms can automatically divide fields to be equal width. (equal)"
   (h/factory-apply Form))

(def ui-form-group
  "A set of fields can appear grouped together.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - grouped (bool): Fields can show related choices. ()
    - inline (bool): Multiple fields may be inline in a row. ()
    - unstackable (bool): A form group can prevent itself from stacking on mobile.
    - widths (enum): Fields Groups can specify their width in grid columns or automatically divide fields to be equal width. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, equal)"
   (h/factory-apply FormGroup))

(def ui-form-input
  "Sugar for <Form.Field control={Input} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormInput))

(def ui-form-dropdown
  "Sugar for <Form.Field control={Dropdown} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormDropdown))

(def ui-form-field
  "A field is a form element containing a label and an input.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - control (custom): A form control component (i.e. Dropdown) or HTML tagName (i.e. 'input').
    - disabled (bool): Individual fields may be disabled.
    - error (bool): Individual fields may display an error state.
    - inline (bool): A field can have its label next to instead of above it.
    - label (node|object): Mutually exclusive with children. ()
    - required (bool): A field can show that input is mandatory.
    - type (): Passed to the control component (i.e. <input type='password' />) ()
    - width (enum): A field can specify its width in grid columns (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
   (h/factory-apply FormField))

(def ui-form-checkbox
  "Sugar for <Form.Field control={Checkbox} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormCheckbox))

(def ui-form-button
  "Sugar for <Form.Field control={Button} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormButton))

(def ui-form-text-area
  "Sugar for <Form.Field control={TextArea} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormTextArea))

(def ui-form-radio
  "Sugar for <Form.Field control={Radio} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormRadio))

(def ui-form-select
  "Sugar for <Form.Field control={Select} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop.
    - options (arrayOf): Array of Dropdown.Item props e.g. `{ text: '', value: '' }` ([:name \"shape\"], [:value \"Dropdown.Item.propTypes\"], [:computed true])"
   (h/factory-apply FormSelect))