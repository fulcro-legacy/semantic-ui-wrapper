(ns com.fulcrologic.semantic-ui.modules.search.ui-search-category
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Search/SearchCategory" :default SearchCategory]))

  (def ui-search-category
  "

  Props:
    - active (bool): The item currently selected by keyboard shortcut.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - name (string): Display name.
    - renderer (func): Renders the category contents.
    - results (array): Array of Search.Result props."
   (h/factory-apply SearchCategory))
