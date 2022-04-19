(ns bar.core
  (:require [cljs.loader :as loader]))

(println "bar.core is evaluating")

(defn woz []
  (println "bar.core/woz callback function is evaluating."))

(loader/set-loaded! :bar)
