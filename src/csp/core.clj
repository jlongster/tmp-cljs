(ns csp.core
  (:require [clojure.core.async :as async
             :refer [chan go >! <! <!! timeout pub sub]])
  (:require [clojure.pprint :refer [pprint]])
  (:gen-class))


(def c (chan))
(def ^:dynamic value 10)

(defn -main [& args]
  (binding [value 20]
    (println value)

    (go
     (set! value 21)
     (let [v (<! c)]
       (println "c1" v))))
  (go
   (<! (timeout 1000))
   (>! c 5))
  
  (println "starting")
  (<!! (go (<! (timeout 10000)))))