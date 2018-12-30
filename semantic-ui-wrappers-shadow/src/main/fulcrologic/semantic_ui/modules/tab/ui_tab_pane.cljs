(ns fulcrologic.semantic-ui.modules.tab.ui-tab-pane
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Tab/TabPane" :default TabPane]))

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
