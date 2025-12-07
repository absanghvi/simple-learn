# MCP Tutorial — Chapter 7: Advanced Topics

## Topics covered

- Dependency isolation strategies (containers, virtual envs, reproducible builds).
- Model and artifact provenance (signing, checksums, supply chain).
- Streaming or stateful components and how to express them in contracts.

## Dependency isolation

- Use pinned dependency manifests and lockfiles.
- For full isolation, containerize the runtime with a small Dockerfile that installs only what's required.

## Provenance & signing

- Include checksums for large assets in `mcp.yaml`.
- Consider signing artifacts before publishing to a registry so consumers can verify origin.

## Stateful components

- When a component has state, document expected lifecycle operations (init, checkpoint, restore) in the contract.

## Scaling and observability

- Emit structured logs and metrics from your component. Declare observability hooks in metadata when necessary.

## Next

Finish with Chapter 8: Resources & Next Steps (`mcp-08-resources-and-next-steps.md`).
