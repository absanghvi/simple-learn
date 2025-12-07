package com.example.mcp.service;

import org.springframework.stereotype.Service;

@Service
public class AiServiceImpl implements AiService {

    // Placeholder implementation. Replace this with a Spring AI-backed bean or cloud provider.
    @Override
    public String generateGreeting(String name) {
        return String.format("Hello, %s!", name);
    }
}
