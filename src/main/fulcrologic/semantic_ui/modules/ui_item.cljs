(ns fulcrologic.semantic-ui.modules.ui-item
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Item ItemHeader ItemGroup ItemDescription ItemImage ItemMeta ItemExtra ItemContent]]))

(def ui-item
  "An item view presents large collections of site content for display.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for ItemContent component.
    - description (custom): Shorthand for ItemDescription component.
    - extra (custom): Shorthand for ItemExtra component.
    - header (custom): Shorthand for ItemHeader component.
    - image (custom): Shorthand for ItemImage component.
    - meta (custom): Shorthand for ItemMeta component."
   (h/factory-apply Item))

(def ui-item-header
  "An item can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ItemHeader))

(def ui-item-group
  "A group of items.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - divided (bool): Items can be divided to better distinguish between grouped content.
    - items (custom): Shorthand array of props for Item.
    - link (bool): An item can be formatted so that the entire contents link to another page.
    - relaxed (bool|enum): A group of items can relax its padding to provide more negative space. (very)
    - unstackable (bool): Prevent items from stacking on mobile."
   (h/factory-apply ItemGroup))

(def ui-item-description
  "An item can contain a description with a single or multiple paragraphs.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ItemDescription))

(def ui-item-image
  "An item can contain an image.

  Props:
    - size (custom): An image may appear at different sizes."
   (h/factory-apply ItemImage))

(def ui-item-meta
  "An item can contain content metadata.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ItemMeta))

(def ui-item-extra
  "An item can contain extra content meant to be formatted separately from the main content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply ItemExtra))

(def ui-item-content
  "An item can contain content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for ItemDescription component.
    - extra (custom): Shorthand for ItemExtra component.
    - header (custom): Shorthand for ItemHeader component.
    - meta (custom): Shorthand for ItemMeta component.
    - verticalAlign (enum): Content can specify its vertical alignment. (bottom, middle, top)"
   (h/factory-apply ItemContent))