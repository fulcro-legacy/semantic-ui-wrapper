(ns fulcrologic.semantic-ui.modules.ui-tab
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Tab TabPane]]))

(def ui-tab
  "A Tab is a hidden section of content activated by a Menu.

  Props:
    - activeIndex (number|string): Index of the currently active tab. ()
    - as (custom): An element type to render as (string or function).
    - defaultActiveIndex (number|string): The initial activeIndex. ()
    - grid (object): Shorthand props for the Grid.
    - menu (object): Shorthand props for the Menu.
    - menuPosition (enum): Align vertical menu (left, right)
    - onTabChange (func): Called on tab change.
    - panes (arrayOf): Array of objects describing each Menu.Item and Tab.Pane: ([:name \"shape\"], [:value {:menuItem {:name \"custom\", :raw \"customPropTypes.itemShorthand\", :required false}, :pane {:name \"custom\", :raw \"customPropTypes.itemShorthand\", :required false}, :render {:name \"func\", :required false}}])
    - renderActiveOnly (bool): A Tab can render only active pane."
   (h/factory-apply Tab))

(def ui-tab-pane
  "A tab pane holds the content of a tab.

  Props:
    - active (bool): A tab pane can be active.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - loading (bool): A Tab.Pane can display a loading indicator."
   (h/factory-apply TabPane))