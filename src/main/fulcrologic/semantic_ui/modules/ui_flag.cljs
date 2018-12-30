(ns fulcrologic.semantic-ui.modules.ui-flag
  (:require
    [fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react" :refer [Flag]]))

(def ui-flag
  "A flag is is used to represent a political state.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - name (enum): Flag name, can use the two digit country code, the full name, or a common alias. (ad, andorra, ae, united arab emirates, uae, af, afghanistan, ag, antigua, ai, anguilla, al, albania, am, armenia, an, netherlands antilles, ao, angola, ar, argentina, as, american samoa, at, austria, au, australia, aw, aruba, ax, aland islands, az, azerbaijan, ba, bosnia, bb, barbados, bd, bangladesh, be, belgium, bf, burkina faso, bg, bulgaria, bh, bahrain, bi, burundi, bj, benin, bm, bermuda, bn, brunei, bo, bolivia, br, brazil, bs, bahamas, bt, bhutan, bv, bouvet island, bw, botswana, by, belarus, bz, belize, ca, canada, cc, cocos islands, cd, congo, cf, central african republic, cg, congo brazzaville, ch, switzerland, ci, cote divoire, ck, cook islands, cl, chile, cm, cameroon, cn, china, co, colombia, cr, costa rica, cs, cu, cuba ...)"
   (h/factory-apply Flag))