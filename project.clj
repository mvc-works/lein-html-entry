(defproject mvc-works/html-entry "0.0.1"
  :description "Generate index.html for loading scripts"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :plugins [[cirru/lein-sepal "0.0.9"]]
  :dependencies [[hiccup "1.0.5"]]
  :profiles {:dev {:cirru-sepal {:paths ["cirru-src"] :extension ".clj"}}}
  :html-entry {:file "src/html.clj" :output "target/public/index.html"})
