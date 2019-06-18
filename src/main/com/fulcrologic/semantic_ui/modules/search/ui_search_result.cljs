(ns fulcrologic.semantic-ui.modules.search.ui-search-result
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Search/SearchResult" :default SearchResult]))

  (def ui-search-result
  "

  Props:
    - active (bool): The item currently selected by keyboard shortcut.
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (string): Additional text with less emphasis.
    - id (number|string): A unique identifier. ()
    - image (string): Add an image to the item.
    - onClick (func): Called on click.
    - price (string): Customized text for price.
    - renderer (func): Renders the result contents.
    - title (string): Display title."
   (h/factory-apply SearchResult))
