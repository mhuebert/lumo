(ns lumo.core
  (:require [lumo.repl :as repl]))

(goog-define
  ^{:doc "A string containing the version of the Lumo executable."}
  *lumo-version* "")

(defn eval
  "Evaluates the form data structure (not text!) and returns the result."
  [form]
  (repl/eval form))
