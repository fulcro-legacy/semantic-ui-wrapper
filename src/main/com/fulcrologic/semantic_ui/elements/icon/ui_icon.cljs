(ns fulcrologic.semantic-ui.elements.icon.ui-icon
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/Icon/Icon" :default Icon]))

  (def ui-icon
  "An icon is a glyph used to represent something else.

  Props:
    - aria-hidden (string): Icon can have an aria label.
    - aria-label (string): Icon can have an aria label.
    - as (custom): An element type to render as (string or function).
    - bordered (bool): Formatted to appear bordered.
    - circular (bool): Icon can formatted to appear circular.
    - className (string): Additional classes.
    - color (enum): Color of the icon. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - corner (bool|enum): Icons can display a smaller corner icon. (top left, top right, bottom left, bottom right)
    - disabled (bool): Show that the icon is inactive.
    - fitted (bool): Fitted, without space to left or right of Icon.
    - flipped (enum): Icon can flipped. (horizontally, vertically)
    - inverted (bool): Formatted to have its colors inverted for contrast.
    - link (bool): Icon can be formatted as a link.
    - loading (bool): Icon can be used as a simple loader.
    - name (enum): Name of the icon. (american sign language interpreting, assistive listening systems, audio description, blind, braille, closed captioning, closed captioning outline, deaf, low vision, phone volume, question circle, question circle outline, sign language, tty, universal access, wheelchair, angle double down, angle double left, angle double right, angle double up, angle down, angle left, angle right, angle up, arrow alternate circle down, arrow alternate circle down outline, arrow alternate circle left, arrow alternate circle left outline, arrow alternate circle right, arrow alternate circle right outline, arrow alternate circle up, arrow alternate circle up outline, arrow circle down, arrow circle left, arrow circle right, arrow circle up, arrow down, arrow left, arrow right, arrow up, arrows alternate, arrows alternate horizontal, arrows alternate vertical, caret down, caret left, caret right, caret square down, caret square down outline, caret square left, caret square left outline, caret square right, caret square right outline, caret square up, caret square up outline, caret up, cart arrow down, chart line, chevron circle down, chevron circle left, chevron circle right, chevron circle up, chevron down, chevron left, chevron right, chevron up, cloud download, cloud upload, download, exchange, expand arrows alternate, external alternate, external square alternate, hand point down, hand point down outline, hand point left, hand point left outline, hand point right, hand point right outline, hand point up, hand point up outline, hand pointer, hand pointer outline, history, level down alternate, level up alternate, location arrow, long arrow alternate down, long arrow alternate left, long arrow alternate right, long arrow alternate up, mouse pointer, play, random, recycle, redo, redo alternate, reply, reply all, retweet, share ...)
    - rotated (enum): Icon can rotated. (clockwise, counterclockwise)
    - size (enum): Size of the icon. (mini, tiny, small, large, big, huge, massive)"
   (h/factory-apply Icon))
