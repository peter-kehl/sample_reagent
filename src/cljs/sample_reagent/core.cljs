(ns sample-reagent.core
  (:require
   [reagent.core :as reagent]))

(defn body []
  [:div "hello"])

(defn on-js-reload []
  (reagent/render
   [body]
   (.getElementById js/document "app")))

(defn ^:export main []
  (on-js-reload))

(on-js-reload)






