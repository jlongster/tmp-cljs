(ns csp.core)

(enable-console-print!)

(defn -main []
  (. js/console (log "foo!")))

(set! *main-cli-fn* -main)
