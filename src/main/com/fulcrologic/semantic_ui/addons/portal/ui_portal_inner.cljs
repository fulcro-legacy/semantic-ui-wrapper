(ns com.fulcrologic.semantic-ui.addons.portal.ui-portal-inner
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/addons/Portal/PortalInner" :default PortalInner]))

  (def ui-portal-inner
  "An inner component that allows you to render children outside their parent.

  Props:
    - children (node): Primary content.
    - mountNode (any): The node where the portal should mount.
    - onMount (func): Called when the portal is mounted on the DOM
    - onUnmount (func): Called when the portal is unmounted from the DOM"
   (h/factory-apply PortalInner))
