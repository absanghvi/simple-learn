# MCP Tutorial — Chapter 2: Setup & Prerequisites

## Goals

- Get your environment ready to follow the rest of this tutorial series.
- Install necessary tools and verify a minimal working example.

## Prerequisites

- Basic familiarity with command line (PowerShell, bash).
- Python 3.8+ installed (or the runtime your MCP uses).
- Git for version control.

## Recommended environment

1. Create a virtual environment:

```powershell
python -m venv .venv
.\.venv\Scripts\Activate.ps1
pip install --upgrade pip
```

2. Install common utilities used in this tutorial (adjust to your stack):

```powershell
pip install click pyyaml pytest
```

3. Clone or navigate to your project workspace and confirm you can run a small sanity script.

## Sanity check example (Python)

Create `hello_mcp.py` with a tiny callable function and run it to confirm the environment works.

```python
def greet(name="MCP learner"):
    return f"Hello, {name}!"

if __name__ == '__main__':
    print(greet())
```

Run:

```powershell
python hello_mcp.py
```

Expected output: `Hello, MCP learner!`

## Notes

- If your MCP runtime requires other dependencies (e.g., Java, Rust, a specific framework), install them now. We assume Python for examples but keep concepts language-agnostic otherwise.

## Next

Proceed to Chapter 3: Core Concepts (`mcp-03-core-concepts.md`).
