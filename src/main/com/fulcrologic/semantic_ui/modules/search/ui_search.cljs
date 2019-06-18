(ns fulcrologic.semantic-ui.modules.search.ui-search
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Search/Search" :default Search]))

  (def ui-search
  "A search module allows a user to query for results from a selection of data

  Props:
    - aligned (string): A search can have its results aligned to its left or right container edge.
    - as (custom): An element type to render as (string or function).
    - category (bool): A search can display results from remote content ordered by categories.
    - categoryRenderer (func): Renders the SearchCategory contents.
    - className (string): Additional classes.
    - defaultOpen (bool): Initial value of open.
    - defaultValue (string): Initial value.
    - fluid (bool): A search can have its results take up the width of its container.
    - icon (node|object): Shorthand for Icon. ()
    - input (custom): A search input can take up the width of its container.
    - loading (bool): A search can show a loading indicator.
    - minCharacters (number): Minimum characters to query for results
    - noResultsDescription (node): Additional text for \"No Results\" message with less emphasis.
    - noResultsMessage (node): Message to display when there are no results.
    - onBlur (func): Called on blur.
    - onFocus (func): Called on focus.
    - onMouseDown (func): Called on mousedown.
    - onResultSelect (func): Called when a result is selected.
    - onSearchChange (func): Called on search input change.
    - onSelectionChange (func): Called when the active selection index is changed.
    - open (bool): Controls whether or not the results menu is displayed.
    - resultRenderer (func): Renders the SearchResult contents.
    - results (arrayOf|shape): One of: ()
    - selectFirstResult (bool): Whether the search should automatically select the first result after searching.
    - showNoResults (bool): Whether a \"no results\" message should be shown if no results are found.
    - size (enum): A search can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - value (string): Current value of the search input. Creates a controlled component."
   (h/wrapped-factory-apply Search))
