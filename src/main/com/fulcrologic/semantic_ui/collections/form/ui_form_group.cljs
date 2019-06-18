(ns com.fulcrologic.semantic-ui.collections.form.ui-form-group
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Form/FormGroup" :default FormGroup]))

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
