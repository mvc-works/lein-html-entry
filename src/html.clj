
(require '[hiccup.core :refer [html]])

(defn render [data] (html [:html data]))

(defn id [x] x)

(id render)