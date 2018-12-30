(ns fulcrologic.semantic-ui.modules.ui-placeholder
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Placeholder PlaceholderImage PlaceholderLine PlaceholderParagraph PlaceholderHeader]]))

(def ui-placeholder
  "A placeholder is used to reserve splace for content that soon will appear in a layout.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fluid (bool): A fluid placeholder takes up the width of its container.
    - inverted (bool): A placeholder can have their colors inverted."
   (h/factory-apply Placeholder))

(def ui-placeholder-image
  "A placeholder can contain an image.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - rectangular (bool): An image can modify size correctly with responsive styles. ()
    - square (bool): An image can modify size correctly with responsive styles. ()"
   (h/factory-apply PlaceholderImage))

(def ui-placeholder-line
  "A placeholder can contain have lines of text.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - length (enum): A line can specify how long its contents should appear. (full, very long, long, medium, short, very short)"
   (h/factory-apply PlaceholderLine))

(def ui-placeholder-paragraph
  "A placeholder can contain a paragraph.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply PlaceholderParagraph))

(def ui-placeholder-header
  "A placeholder can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - image (bool): A placeholder can contain an image."
   (h/factory-apply PlaceholderHeader))