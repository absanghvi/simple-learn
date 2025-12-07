# MCP Tutorial — Chapter 5: Tools & Workflow

## Objectives

- Introduce common tools used when building, packaging, testing, and publishing MCP artifacts.
- Show a typical developer workflow from local dev to registry.

## Tool categories

- Packaging: tools to build portable artifacts (wheel, Docker, custom packager).
- Validation: schema checkers for `mcp.yaml`, unit and integration tests.
- Registry: local or remote store for artifacts.
- Orchestration: systems that run MCP artifacts at scale.

## Example local workflow

1. Implement component and `mcp.yaml`.
2. Run local unit tests:

```powershell
pytest tests/
```

3. Build artifact (example: a zip or wheel + metadata).
4. Validate the artifact with a schema linter.
5. Publish to a registry or share the artifact file.

## Example validation script (python)

```python
import yaml

def validate_mcp(path):
    data = yaml.safe_load(open(path))
    assert 'name' in data and 'entrypoint' in data

if __name__ == '__main__':
    validate_mcp('mcp.yaml')
    print('mcp.yaml looks ok')
```

## CI suggestions

- Run `pytest` and `mcp` schema checks in CI on every PR.
- Build an artifact in CI and attach as a release candidate for reproducibility.

## Next

Go to Chapter 6: Examples & Exercises (`mcp-06-examples-and-exercises.md`).
