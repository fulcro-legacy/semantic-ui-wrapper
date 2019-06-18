(ns com.fulcrologic.semantic-ui.collections.form.ui-form-input
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Form/FormInput" :default FormInput]))

  (def ui-form-input
  "Sugar for <Form.Field control={Input} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/wrapped-factory-apply FormInput))
