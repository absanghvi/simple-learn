# MCP Tutorial — Chapter 2: Setup & Prerequisites

## Goals

- Get your environment ready to follow the rest of this tutorial series which uses Java Spring Boot, Spring Data (H2) and (optionally) Spring AI for example integrations.

## Prerequisites

- JDK 17+ (AdoptOpenJDK, Temurin, or OpenJDK). Set JAVA_HOME appropriately.
- Maven 3.6+ (or Gradle if you prefer; this guide uses Maven examples).
- Git for version control and a working shell (PowerShell on Windows examples below).

## Recommended environment (Windows / PowerShell)

1. Verify Java and Maven are installed:

```powershell
java -version
mvn -v
```

2. Configure a workspace directory and clone this repo (or create a new project):

```powershell
cd C:\Users\you\workspace
git clone <your-repo>
cd simple-learn\knowledge-base\tutorials\mcp
```

3. Install an IDE (recommended): IntelliJ IDEA, VS Code with Java extensions, or Eclipse.

## Sanity check example (Maven)

Create a minimal Maven project or use the example included in this tutorial under `examples/spring-boot-ai`. To quickly test Maven can build a project:

```powershell
mvn -f examples\spring-boot-ai\pom.xml clean package
```

If Maven builds successfully, you can run the example Spring Boot app:

```powershell
mvn -f examples\spring-boot-ai\spring-boot:run
```

Or run the packaged jar:

```powershell
java -jar examples\spring-boot-ai\target\spring-boot-ai-0.0.1-SNAPSHOT.jar
```

## Notes

- This series uses Spring Boot for examples and H2 (in-memory) for simple persistence. The AI integration is demonstrated via a replaceable service abstraction so you can swap a mock implementation for a real Spring AI model bean or other provider.

## Next

Proceed to Chapter 3: Core Concepts (`mcp-03-core-concepts.md`).
