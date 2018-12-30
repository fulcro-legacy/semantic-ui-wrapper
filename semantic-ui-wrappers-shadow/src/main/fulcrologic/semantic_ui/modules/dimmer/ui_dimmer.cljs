(ns fulcrologic.semantic-ui.modules.dimmer.ui-dimmer
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Dimmer/Dimmer" :default Dimmer]))

  (def ui-dimmer
  "A dimmer hides distractions to focus attention on particular content.

  Props:
    - active (bool): An active dimmer will dim its parent container.
    - page (bool): A dimmer can be formatted to be fixed to the page."
   (h/factory-apply Dimmer))
