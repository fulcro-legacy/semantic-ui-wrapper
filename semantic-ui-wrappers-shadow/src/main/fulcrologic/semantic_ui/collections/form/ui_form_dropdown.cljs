(ns fulcrologic.semantic-ui.collections.form.ui-form-dropdown
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Form/FormDropdown" :default FormDropdown]))

  (def ui-form-dropdown
  "Sugar for <Form.Field control={Dropdown} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormDropdown))
