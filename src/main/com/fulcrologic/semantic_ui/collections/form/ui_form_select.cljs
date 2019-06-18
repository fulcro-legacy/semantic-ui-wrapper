(ns fulcrologic.semantic-ui.collections.form.ui-form-select
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Form/FormSelect" :default FormSelect]))

  (def ui-form-select
  "Sugar for <Form.Field control={Select} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop.
    - options (arrayOf): Array of Dropdown.Item props e.g. `{ text: '', value: '' }` ([:name \"shape\"], [:value \"Dropdown.Item.propTypes\"], [:computed true])"
   (h/factory-apply FormSelect))
