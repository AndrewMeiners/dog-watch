(ns dog-watch.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[dog-watch started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[dog-watch has shut down successfully]=-"))
   :middleware identity})
