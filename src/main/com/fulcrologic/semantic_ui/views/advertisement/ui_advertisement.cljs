(ns com.fulcrologic.semantic-ui.views.advertisement.ui-advertisement
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/views/Advertisement/Advertisement" :default Advertisement]))

  (def ui-advertisement
  "An ad displays third-party promotional content.

  Props:
    - as (custom): An element type to render as (string or function).
    - centered (bool): Center the advertisement.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - test (bool|number|string): Text to be displayed on the advertisement. ()
    - unit (enum): Varies the size of the advertisement. (medium rectangle, large rectangle, vertical rectangle, small rectangle, mobile banner, banner, vertical banner, top banner, half banner, button, square button, small button, skyscraper, wide skyscraper, leaderboard, large leaderboard, mobile leaderboard, billboard, panorama, netboard, half page, square, small square)"
   (h/factory-apply Advertisement))
