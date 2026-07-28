(ns kotoba.capability.log.read-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.log.read :as capability]
            [kotoba.core.capability-repository :as repository]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest capability/manifest))))
