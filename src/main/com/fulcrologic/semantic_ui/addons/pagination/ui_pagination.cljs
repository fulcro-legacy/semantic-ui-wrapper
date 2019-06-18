(ns com.fulcrologic.semantic-ui.addons.pagination.ui-pagination
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/Pagination/Pagination" :default Pagination]))

  (def ui-pagination
  "A component to render a pagination.

  Props:
    - activePage (number|string): Index of the currently active page. ()
    - aria-label (string): A pagination item can have an aria label.
    - boundaryRange (number|string): Number of always visible pages at the beginning and end. ()
    - defaultActivePage (number|string): Initial activePage value. ()
    - disabled (bool): A pagination can be disabled.
    - ellipsisItem (custom): A shorthand for PaginationItem.
    - firstItem (custom): A shorthand for PaginationItem.
    - lastItem (custom): A shorthand for PaginationItem.
    - nextItem (custom): A shorthand for PaginationItem.
    - onPageChange (func): Called on change of an active page.
    - pageItem (custom): A shorthand for PaginationItem.
    - prevItem (custom): A shorthand for PaginationItem.
    - siblingRange (number|string): Number of always visible pages before and after the current one. ()
    - totalPages (number|string): Total number of pages. ()"
   (h/factory-apply Pagination))
