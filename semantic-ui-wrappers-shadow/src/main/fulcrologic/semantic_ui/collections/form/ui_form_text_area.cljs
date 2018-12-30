(ns fulcrologic.semantic-ui.collections.form.ui-form-text-area
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Form/FormTextArea" :default FormTextArea]))

  (def ui-form-text-area
  "Sugar for <Form.Field control={TextArea} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormTextArea))
