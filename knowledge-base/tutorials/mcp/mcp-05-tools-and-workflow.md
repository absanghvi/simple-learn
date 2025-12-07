# MCP Tutorial — Chapter 5: Tools & Workflow

## Objectives

- Introduce common tools used when building, packaging, testing, and publishing MCP artifacts.
- Show a typical developer workflow from local dev to registry.


## Tool categories

- Packaging: Maven/Gradle for building jars, Docker for container images.
- Validation: schema checkers for `mcp.yaml`, unit and integration tests using JUnit and Spring Test.
- Registry: Maven repository, artifact storage, or container registries for Docker images.
- Orchestration: Kubernetes or serverless runners that can run Spring Boot artifacts.

## Example local workflow (Java/Spring)

1. Implement component and `mcp.yaml`.
2. Run local unit tests:

```powershell
mvn -f examples\spring-boot-ai\pom.xml test
```

3. Build a packaged jar:

```powershell
mvn -f examples\spring-boot-ai\pom.xml clean package
```

4. Validate the artifact with a schema linter (your `mcp.yaml` schema) and run integration tests.
5. Publish to your artifact registry (Maven repo) or build and push a Docker image.

## Example validation script (Java-friendly)

You can still use a small YAML validator script (Python or Java). For a quick Java check, use SnakeYAML on the CLI or a small validation test in `src/test` that verifies `mcp.yaml` has required fields.

## CI suggestions

- Run `mvn package` and the `mcp` schema checks in CI on every PR.
- Publish the built artifact (jar) as part of your CI pipeline to a snapshot repository.

## Next

Go to Chapter 6: Examples & Exercises (`mcp-06-examples-and-exercises.md`).
