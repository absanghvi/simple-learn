# MCP Tutorial — Chapter 4: Bytecode & Execution

## Goals

- Explain what we mean by bytecode in the MCP context and how execution flows from an artifact to a runtime.
- Illustrate common runtime components and security/sandbox concerns.

## What is "bytecode" here?

In a Java/Spring context, "bytecode" usually refers to compiled `.class` files packaged into a `.jar` (or a Spring Boot fat jar). In MCP we care about:

- Packaging a reproducible executable form of the component (jar with pinned dependencies or a Docker image).
- Ensuring deterministic inputs lead to reproducible outputs.
## Execution flow (typical)

1. Resolution: a system (or user) resolves an artifact (local file, registry, or URL).
2. Validation: the `mcp.yaml` contract is validated for required inputs and environment requirements.
3. Preparation: dependencies are installed and runtime sandbox prepared.
4. Invocation: entrypoint is called with inputs; outputs are collected and validated.


## Example: running a Spring Boot artifact

- Artifact contains `entrypoint: com.example.mcp.GreetApplication::main` in `mcp.yaml`.
- Run the artifact:

```powershell
mvn -f examples\spring-boot-ai\pom.xml spring-boot:run
```

or run the packaged jar:

```powershell
java -jar examples\spring-boot-ai\target\spring-boot-ai-0.0.1-SNAPSHOT.jar
```

Runtimes (or serverless runners) will invoke the declared REST endpoints or main entrypoint. The runtime validates declared inputs (JSON payloads) and maps outputs to the contract.

## Determinism and reproducibility

- Pin dependency versions.
- Record runtime environment, OS, and seed values for randomness.

## Security considerations

- Run untrusted artifacts in a sandbox or container.
- Limit network and filesystem access unless declared by contract.

## Next

Continue to Chapter 5: Tools & Workflow (`mcp-05-tools-and-workflow.md`).
