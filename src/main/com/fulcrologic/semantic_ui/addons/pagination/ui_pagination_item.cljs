(ns com.fulcrologic.semantic-ui.addons.pagination.ui-pagination-item
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/Pagination/PaginationItem" :default PaginationItem]))

  (def ui-pagination-item
  "An item of a pagination.

  Props:
    - active (bool): A pagination item can be active.
    - disabled (bool): A pagination item can be disabled.
    - onClick (func): Called on click.
    - onKeyDown (func): Called on key down.
    - type (enum): A pagination should have a type. (ellipsisItem, firstItem, prevItem, pageItem, nextItem, lastItem)"
   (h/factory-apply PaginationItem))
