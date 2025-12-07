# MCP Tutorial — Chapter 7: Advanced Topics

## Topics covered

- Dependency isolation strategies (containers, virtual envs, reproducible builds).
- Model and artifact provenance (signing, checksums, supply chain).
- Streaming or stateful components and how to express them in contracts.


## Dependency isolation

- Use pinned dependency coordinates in your `pom.xml` (explicit versions). For complete isolation, build a Docker image containing only the runtime and your fat jar.

## Provenance & signing

- Include checksums for large assets in `mcp.yaml` and sign artifacts (GPG signing for jars) before publishing to a Maven repository.

## Stateful components

- For stateful Spring components (stateful services, caches, or model checkpoints), document lifecycle endpoints and expected behavior for init, checkpoint, and restore. Prefer externalizing state to durable stores and use migration scripts for schema changes.

## Scaling and observability

- Expose Micrometer metrics from your Spring Boot app and push to your metrics backend. Emit structured logs (JSON) and declare observability hooks in your artifact metadata.


## Next

Finish with Chapter 8: Resources & Next Steps (`mcp-08-resources-and-next-steps.md`).
