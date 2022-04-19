(ns foo.core
  (:require [goog.dom :as gdom]
            [goog.events :as events]
            [cljs.loader :as loader])
  (:import [goog.events EventType]))

(println "foo.core is evaluating.")

(defn load-bar []
  (loader/load :bar
               (fn []
                 ((resolve 'bar.core/woz)))))

(defn load-qux []
  (loader/load :qux
               (fn []
                 ((resolve 'qux.core/woz)))))

(events/listen (gdom/getElement "both") EventType.CLICK
               (fn [e]
                 (load-bar)
                 (load-qux)))

(events/listen (gdom/getElement "bar") EventType.CLICK
               (fn [e]
                 (load-bar)))

(events/listen (gdom/getElement "qux") EventType.CLICK
               (fn [e]
                 (load-qux)))

(loader/set-loaded! :foo)
