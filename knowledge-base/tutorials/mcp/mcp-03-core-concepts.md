# MCP Tutorial — Chapter 3: Core Concepts

## Learning objectives

- Understand the main building blocks of an MCP-style component: contract, metadata, inputs/outputs, and runtime.
- See how components are versioned and packaged.

## Key terms

- Component: the unit (model/module) that implements a piece of functionality.
- Contract: explicit description of input types, output types, and side effects.
- Metadata: descriptive fields — author, version, provenance, hardware requirements.
- Artifact: packaged component + metadata + assets.


## Component structure (example for Java/Spring Boot)

- `src/main/java/...` — Spring Boot application classes (controllers, services, entities).
- `pom.xml` (or `build.gradle`) — build and dependency configuration.
- `application.yml` / `application.properties` — runtime configuration (data source, ports).
- `mcp.yaml` or equivalent metadata — a small metadata file describing the artifact, entrypoint, and contract (inputs/outputs).
- `src/test/java/...` — unit and integration tests (JUnit/Mockito/Spring Test).

### Example mcp.yaml (minimal) — Java style

```yaml
name: example-spring-component
version: 0.1.0
entrypoint: com.example.mcp.GreetApplication::main
artifact: example-spring-component-0.1.0.jar
inputs:
  - name: name
    type: string
outputs:
  - name: greeting
    type: string
```


## Versioning and compatibility

- Use semantic versioning for artifacts (jar versions). When using Spring Boot fat-jars, keep the artifact coordinates consistent across releases.
- Keep a clear changelog and upgrade notes when contracts (REST endpoints, DTOs, database schemas) change. For Java DTO changes, consider introducing adapter layers to keep backwards compatibility.

## Exercises

1. Draft a minimal `mcp.yaml` for a function that accepts an image and returns a label and confidence score.
2. Write a one-sentence contract describing side effects (e.g., writes logs to disk).

## Next

Go to Chapter 4: Bytecode and Execution (`mcp-04-bytecode-and-execution.md`).
