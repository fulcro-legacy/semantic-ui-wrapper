(ns fulcrologic.semantic-ui.modules.ui-embed
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Embed]]))

(def ui-embed
  "An embed displays content from other websites like YouTube videos or Google Maps.

  Props:
    - active (bool): An embed can be active.
    - as (custom): An element type to render as (string or function).
    - aspectRatio (enum): An embed can specify an alternative aspect ratio. (4:3, 16:9, 21:9)
    - autoplay (bool): Setting to true or false will force autoplay. ()
    - brandedUI (bool): Whether to show networks branded UI like title cards, or after video calls to action. ()
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (string): Specifies a default chrome color with Vimeo or YouTube. ()
    - content (custom): Shorthand for primary content.
    - defaultActive (bool): Initial value of active.
    - hd (bool): Whether to prefer HD content. ()
    - icon (custom): Specifies an icon to use with placeholder content.
    - id (string): Specifies an id for source. ()
    - iframe (custom): Shorthand for HTML iframe. ()
    - onClick (func): Сalled on click.
    - placeholder (string): A placeholder image for embed.
    - source (enum): Specifies a source to use. (youtube, vimeo)
    - url (string): Specifies a url to use for embed. ()"
   (h/factory-apply Embed))