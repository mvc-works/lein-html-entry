(defproject mvc-works/lein-html-entry "0.0.2"
  :description "Generate index.html for loading scripts"
  :url "https://github.com/mvc-works/lein-html-entry"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :plugins [[cirru/lein-sepal "0.0.9"]]
  :dependencies [[hiccup "1.0.5"]]
  :profiles {:dev {:cirru-sepal {:paths ["cirru-src"] :extension ".clj"}}}
  :html-entry {:file "src/html.clj"
               :output "target/public/index.html"
               :data {:text "demo"}})
