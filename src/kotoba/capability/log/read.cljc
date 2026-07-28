(ns kotoba.capability.log.read
  "Importable contract for log/read."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "log/read"))
