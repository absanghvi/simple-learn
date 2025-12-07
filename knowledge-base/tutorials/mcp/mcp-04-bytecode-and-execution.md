# MCP Tutorial — Chapter 4: Bytecode & Execution

## Goals

- Explain what we mean by bytecode in the MCP context and how execution flows from an artifact to a runtime.
- Illustrate common runtime components and security/sandbox concerns.

## What is "bytecode" here?

Depending on the stack, "bytecode" can refer to compiled intermediate representations (Python .pyc, Java .class), or a serialized instruction format used by a small VM. In MCP we often care about:

- Packaging a reproducible executable form of the component.
- Ensuring deterministic inputs lead to reproducible outputs.

## Execution flow (typical)

1. Resolution: a system (or user) resolves an artifact (local file, registry, or URL).
2. Validation: the `mcp.yaml` contract is validated for required inputs and environment requirements.
3. Preparation: dependencies are installed and runtime sandbox prepared.
4. Invocation: entrypoint is called with inputs; outputs are collected and validated.

## Example: running a Python artifact

- Artifact contains `entrypoint: mymodule:predict` in `mcp.yaml`.
- Runtime loads module, calls `predict(inputs)` and maps returned dict to declared outputs.

## Determinism and reproducibility

- Pin dependency versions.
- Record runtime environment, OS, and seed values for randomness.

## Security considerations

- Run untrusted artifacts in a sandbox or container.
- Limit network and filesystem access unless declared by contract.

## Next

Continue to Chapter 5: Tools & Workflow (`mcp-05-tools-and-workflow.md`).
