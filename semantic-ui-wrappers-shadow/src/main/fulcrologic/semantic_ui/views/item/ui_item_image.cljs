(ns fulcrologic.semantic-ui.views.item.ui-item-image
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Item/ItemImage" :default ItemImage]))

  (def ui-item-image
  "An item can contain an image.

  Props:
    - size (custom): An image may appear at different sizes."
   (h/factory-apply ItemImage))
