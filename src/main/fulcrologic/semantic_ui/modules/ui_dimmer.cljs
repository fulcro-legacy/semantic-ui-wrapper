(ns fulcrologic.semantic-ui.modules.ui-dimmer
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Dimmer DimmerDimmable DimmerInner]]))

(def ui-dimmer
  "A dimmer hides distractions to focus attention on particular content.

  Props:
    - active (bool): An active dimmer will dim its parent container.
    - page (bool): A dimmer can be formatted to be fixed to the page."
   (h/factory-apply Dimmer))

(def ui-dimmer-dimmable
  "A dimmable sub-component for Dimmer.

  Props:
    - as (custom): An element type to render as (string or function).
    - blurring (bool): A dimmable element can blur its contents.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - dimmed (bool): Controls whether or not the dim is displayed."
   (h/factory-apply DimmerDimmable))

(def ui-dimmer-inner
  "An inner element for a Dimmer.

  Props:
    - active (bool): An active dimmer will dim its parent container.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A disabled dimmer cannot be activated
    - inverted (bool): A dimmer can be formatted to have its colors inverted.
    - onClick (func): Called on click.
    - onClickOutside (func): Handles click outside Dimmer's content, but inside Dimmer area.
    - page (bool): A dimmer can be formatted to be fixed to the page.
    - simple (bool): A dimmer can be controlled with simple prop.
    - verticalAlign (enum): A dimmer can have its content top or bottom aligned. (bottom, top)"
   (h/factory-apply DimmerInner))