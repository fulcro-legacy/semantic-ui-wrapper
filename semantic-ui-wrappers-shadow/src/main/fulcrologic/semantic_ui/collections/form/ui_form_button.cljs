(ns fulcrologic.semantic-ui.collections.form.ui-form-button
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Form/FormButton" :default FormButton]))

  (def ui-form-button
  "Sugar for <Form.Field control={Button} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormButton))
