# MCP Tutorial — Chapter 6: Examples & Exercises

## Goals

- Provide runnable examples that exercise the MCP contract flow.
- Give exercises to practice packaging, validation, and running artifacts.

## Example 1: Minimal Spring Boot component (Greet API)

This example demonstrates a small Spring Boot application that exposes a `/greet` REST endpoint, stores greetings in an H2 in-memory DB, and uses an `AiService` abstraction that you can replace with a real Spring AI-backed bean.

Project location: `examples/spring-boot-ai`

Key files (created in the example project):

- `pom.xml` — Maven build with Spring Boot, H2, and test dependencies.
- `src/main/java/com/example/mcp/GreetApplication.java` — SpringBootApplication main.
- `src/main/java/com/example/mcp/controller/GreetController.java` — REST controller exposing `/greet`.
- `src/main/java/com/example/mcp/service/AiService.java` — AI abstraction for generating greeting text.
- `src/main/java/com/example/mcp/entity/Greeting.java` — JPA entity persisted to H2.
- `src/main/java/com/example/mcp/repo/GreetingRepository.java` — Spring Data JPA repository.

Run locally (from repo root):

```powershell
mvn -f examples\spring-boot-ai\pom.xml clean package
mvn -f examples\spring-boot-ai\pom.xml spring-boot:run
```

Call the API (example):

```powershell
Invoke-RestMethod -Method Post -Uri http://localhost:8080/greet -Body (@{name='Alice'} | ConvertTo-Json) -ContentType 'application/json'
```

## Exercises

1. Replace the placeholder `AiService` with a real provider (e.g., a Spring AI bean or a cloud AI SDK) and update the app to call the real model.
2. Add integration tests using `@SpringBootTest` that exercise the controller and repository with the H2 test profile.
3. Containerize the service with a small `Dockerfile` and run it with Docker.

## Example test (JUnit + Spring)

```java
@SpringBootTest
class GreetControllerTest {
  @Autowired
  private TestRestTemplate rest;

  @Test
  void greetReturnsGreeting() {
    var res = rest.postForEntity("/greet", Map.of("name", "Sam"), Map.class);
    assertEquals(200, res.getStatusCodeValue());
    assertTrue(((Map)res.getBody()).containsKey("greeting"));
  }
}
```

## Next

Continue to Chapter 7: Advanced Topics (`mcp-07-advanced-topics.md`).
