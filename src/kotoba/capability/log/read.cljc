(ns kotoba.capability.log.read
  "Importable contract for log/read.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:log-read}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z4NFr1rR5c7VKNCNgCuQBHbNgj43w", :capability/repository "kotoba-lang/capability-log-read", :capability/id "log/read", :capability/effects #{:storage-read}, :capability/provider-status :contract-only})
