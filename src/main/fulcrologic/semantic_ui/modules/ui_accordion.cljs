(ns fulcrologic.semantic-ui.modules.ui-accordion
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Accordion AccordionPanel AccordionContent AccordionTitle AccordionAccordion]]))

(def ui-accordion
  "An accordion allows users to toggle the display of sections of content.

  Props:
    - className (string): Additional classes.
    - fluid (bool): Format to take up the width of its container.
    - inverted (bool): Format for dark backgrounds.
    - styled (bool): Adds some basic styling to accordion panels."
   (h/factory-apply Accordion))

(def ui-accordion-panel
  "A panel sub-component for Accordion component.

  Props:
    - active (bool): Whether or not the title is in the open state.
    - content (custom): A shorthand for Accordion.Content.
    - index (number|string): A panel index. ()
    - onTitleClick (func): Called when a panel title is clicked.
    - title (custom): A shorthand for Accordion.Title."
   (h/factory-apply AccordionPanel))

(def ui-accordion-content
  "A content sub-component for Accordion component.

  Props:
    - active (bool): Whether or not the content is visible.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply AccordionContent))

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

(def ui-accordion-accordion
  "An Accordion can contain sub-accordions.

  Props:
    - activeIndex (union): Index of the currently active panel. ()
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - defaultActiveIndex (union): Initial activeIndex value. ()
    - exclusive (bool): Only allow one panel open at a time.
    - onTitleClick (func): Called when a panel title is clicked. ()
    - panels (arrayOf): Shorthand array of props for Accordion. ()"
   (h/factory-apply AccordionAccordion))