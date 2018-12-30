(ns fulcrologic.semantic-ui.modules.sidebar.ui-sidebar-pusher
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Sidebar/SidebarPusher" :default SidebarPusher]))

  (def ui-sidebar-pusher
  "A pushable sub-component for Sidebar.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - dimmed (bool): Controls whether or not the dim is displayed."
   (h/factory-apply SidebarPusher))
