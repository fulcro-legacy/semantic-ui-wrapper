(ns fulcrologic.semantic-ui.collections.form.ui-form-radio
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Form/FormRadio" :default FormRadio]))

  (def ui-form-radio
  "Sugar for <Form.Field control={Radio} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   (h/factory-apply FormRadio))
