(ns fulcrologic.semantic-ui.modules.ui-header
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Header HeaderContent HeaderSubheader]]))

(def ui-header
  "A header provides a short summary of content

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Attach header  to other content, like a segment. (top, bottom)
    - block (bool): Format header to appear inside a content block.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): Color of the header. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - disabled (bool): Show that the header is inactive.
    - dividing (bool): Divide header from the content below it.
    - floated (enum): Header can sit to the left or right of other content. (left, right)
    - icon (union): Add an icon by icon name or pass an Icon. ()
    - image (union): Add an image by img src or pass an Image. ()
    - inverted (bool): Inverts the color of the header for dark backgrounds.
    - size (enum): Content headings are sized with em and are based on the font-size of their container. (tiny, small, medium, large, huge)
    - sub (bool): Headers may be formatted to label smaller or de-emphasized content.
    - subheader (custom): Shorthand for Header.Subheader.
    - textAlign (enum): Align header content. (left, center, right, justified)"
   (h/factory-apply Header))

(def ui-header-content
  "Header content wraps the main content when there is an adjacent Icon or Image.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply HeaderContent))

(def ui-header-subheader
  "Headers may contain subheaders.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   (h/factory-apply HeaderSubheader))