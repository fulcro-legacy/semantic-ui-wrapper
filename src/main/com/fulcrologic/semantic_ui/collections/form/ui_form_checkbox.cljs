(ns fulcrologic.semantic-ui.collections.form.ui-form-checkbox
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Form/FormCheckbox" :default FormCheckbox]))

  (def ui-form-checkbox
  "Sugar for <Form.Field control={Checkbox} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormCheckbox))
