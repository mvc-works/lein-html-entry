
ns leiningen.html-entry
  :require
    [] clojure.java.io :refer $ [] writer

declare render

defn html-entry (project & args)
  let
      output $ :output $ :html-entry project
      render $ load-file $ :file $ :html-entry project
    with-open
      [] wrtr $ writer output
      .write wrtr $ render "|demo"
    println $ str "|wrote file to " output
