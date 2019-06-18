(ns com.fulcrologic.semantic-ui.modules.accordion.ui-accordion-title
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/modules/Accordion/AccordionTitle" :default AccordionTitle]))

  (def ui-accordion-title
  "A title sub-component for Accordion component.

  Props:
    - active (bool): Whether or not the title is in the open state.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - index (string|number): AccordionTitle index inside Accordion. ()
    - onClick (func): Called on click."
   (h/factory-apply AccordionTitle))
