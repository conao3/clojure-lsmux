(ns user
  (:require
   [malli.clj-kondo :as mc]))

(alter-var-root #'*warn-on-reflection* (constantly true))

(comment
  (-> (mc/collect *ns*) (mc/linter-config))
  (mc/emit!))
