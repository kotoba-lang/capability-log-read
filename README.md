# capability-log-read

Atomic authority package for `log/read`.

- imports: `#{:log-read}`
- effects: `#{:storage-read}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
