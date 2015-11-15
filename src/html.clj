
(require '[hiccup.core :refer [html]])

(defn render [data] (html [:html [:div "text is: " (:text data)]]))

(defn id [x] x)

(id render)