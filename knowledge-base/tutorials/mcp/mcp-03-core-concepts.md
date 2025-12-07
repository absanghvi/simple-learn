# MCP Tutorial — Chapter 3: Core Concepts

## Learning objectives

- Understand the main building blocks of an MCP-style component: contract, metadata, inputs/outputs, and runtime.
- See how components are versioned and packaged.

## Key terms

- Component: the unit (model/module) that implements a piece of functionality.
- Contract: explicit description of input types, output types, and side effects.
- Metadata: descriptive fields — author, version, provenance, hardware requirements.
- Artifact: packaged component + metadata + assets.

## Component structure (example)

- `component.py` — the implementation or entrypoint.
- `mcp.yaml` — the metadata/contract describing how to run `component.py`.
- `requirements.txt` / `environment.yml` — dependencies.
- `tests/` — small validation tests.

### Example mcp.yaml (minimal)

```yaml
name: example-component
version: 0.1.0
entrypoint: component:serve
inputs:
  - name: text
    type: string
outputs:
  - name: label
    type: string
```

## Versioning and compatibility

- Use semantic versioning for artifacts.
- Keep a clear changelog and upgrade notes when contracts change.

## Exercises

1. Draft a minimal `mcp.yaml` for a function that accepts an image and returns a label and confidence score.
2. Write a one-sentence contract describing side effects (e.g., writes logs to disk).

## Next

Go to Chapter 4: Bytecode and Execution (`mcp-04-bytecode-and-execution.md`).
