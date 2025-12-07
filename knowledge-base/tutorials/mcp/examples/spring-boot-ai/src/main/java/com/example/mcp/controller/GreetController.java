package com.example.mcp.controller;

import com.example.mcp.entity.Greeting;
import com.example.mcp.repo.GreetingRepository;
import com.example.mcp.service.AiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GreetController {

    private final AiService aiService;
    private final GreetingRepository repo;

    public GreetController(AiService aiService, GreetingRepository repo) {
        this.aiService = aiService;
        this.repo = repo;
    }

    @PostMapping("/greet")
    public ResponseEntity<Map<String, Object>> greet(@RequestBody Map<String, String> body) {
        String name = body.getOrDefault("name", "world");
        String greetingText = aiService.generateGreeting(name);
        Greeting g = repo.save(new Greeting(name, greetingText));
        return ResponseEntity.ok(Map.of("id", g.getId(), "greeting", g.getGreeting()));
    }
}
