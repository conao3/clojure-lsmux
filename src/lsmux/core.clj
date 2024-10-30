(ns lsmux.core
  (:require
   [malli.experimental :as mx])
  (:gen-class))

(mx/defn action-default :- :any
  []
  (println "default"))

(defn -main
  "Entrypoint"
  [& args]
  (println args)
  (action-default))
