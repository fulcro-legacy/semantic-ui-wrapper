(ns com.fulcrologic.semantic-ui.addons.ref.ui-ref
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/Ref/Ref" :default Ref]))

  (def ui-ref
  "This component exposes a callback prop that always returns the DOM node of both functional and class component
  children.

  Props:
    - children (element): Primary content.
    - innerRef (func|object): Called when a child component will be mounted or updated. ()"
   (h/factory-apply Ref))
