(ns com.fulcrologic.semantic-ui.modules.search.ui-search-results
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Search/SearchResults" :default SearchResults]))

  (def ui-search-results
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply SearchResults))
