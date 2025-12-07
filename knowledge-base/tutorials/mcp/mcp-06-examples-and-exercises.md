# MCP Tutorial — Chapter 6: Examples & Exercises

## Goals

- Provide runnable examples that exercise the MCP contract flow.
- Give exercises to practice packaging, validation, and running artifacts.

## Example 1: Minimal Python component

Files:

- `component.py`:

```python
def predict(name: str) -> dict:
    return {"greeting": f"Hello, {name}!"}

if __name__ == '__main__':
    print(predict('world'))
```

- `mcp.yaml`:

```yaml
name: greet-component
version: 0.0.1
entrypoint: component:predict
inputs:
  - name: name
    type: string
outputs:
  - name: greeting
    type: string
```

Run locally:

```powershell
python -c "from component import predict; print(predict('Alice'))"
```

## Exercises

1. Extend the example to accept a language code and return localized greetings.
2. Add unit tests for the component and run with `pytest`.
3. Package the component and write a short `publish` script that creates a zip containing `component.py` and `mcp.yaml`.

## Example test (pytest)

```python
from component import predict

def test_greet():
    out = predict('Sam')
    assert out['greeting'] == 'Hello, Sam!'
```

## Next

Continue to Chapter 7: Advanced Topics (`mcp-07-advanced-topics.md`).
