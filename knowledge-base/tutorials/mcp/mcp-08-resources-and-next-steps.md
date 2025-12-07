# MCP Tutorial — Chapter 8: Resources & Next Steps


## Further reading

- Spring Boot reference docs: configuration, packaging, and deployment.
- Spring Data JPA and H2 guides for local persistence and testing.
- Guides on reproducible builds, jar signing, and secure supply chains.

## Practical next steps

1. Pick an internal model or module and rewrite its example as a Spring Boot component with `mcp.yaml` describing the contract.
2. Add CI checks to validate the `mcp.yaml`, run `mvn test`, and build the artifact on PRs.
3. Publish the artifact to a Maven registry and try running it from another machine or CI job.

## Suggestions for expanding this tutorial

- Add a complete example repository (done: `examples/spring-boot-ai`) with a small Spring Boot app, tests, and a Dockerfile.
- Add diagrams for the execution flow and recommended folder layouts.
- Provide a short guide for integrating Spring AI (or other model providers) into the `AiService` abstraction.


## Practical next steps

1. Pick an internal model or module and write an `mcp.yaml` for it.
2. Add CI checks to validate the MCP artifact and run tests on PRs.
3. Publish the artifact to your internal registry and try running it from another machine.


## Contact and contributions

If you have additions or corrections, open a PR against this repository. Add real links to resources and project-specific references.

---
End of MCP tutorial series.
