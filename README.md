
# html-entry

A Leiningen plugin to generate `index.html` for loading scripts.

## Usage

[![Clojars Project](http://clojars.org/mvc-works/html-entry/latest-version.svg)](http://clojars.org/mvc-works/html-entry)

Put `[html-entry "0.1.0"]` into the `:plugins` vector of your `project.clj`.

Configure the plugin like this:

```clojure
:html-entry {:file "src/html.clj"
             :output "target/public/index.html"
             :data {}} ; data will be passed to `render` function
```

also create a Clojure file for `load-file` to call, for example:

```clojure
(require '[hiccup.core :refer [html]])

(defn render [data] (html [:html data]))

(defn id [x] x)
(id render) ; return function `render`, plugin will use it
```

then generate `index.html` by running:

```bash
lein html-entry
```

## License

Copyright © 2015 jiyinyiyong

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
