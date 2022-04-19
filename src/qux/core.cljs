(ns qux.core
  (:require [cljs.loader :as loader]))

(println "qux.core is evaluating.")

(defn woz []
  (println "qux.core/woz callback function is evaluating."))

(loader/set-loaded! :qux)
