package com.example.mcp.entity;

import jakarta.persistence.*;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String greeting;

    public Greeting() {}

    public Greeting(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getGreeting() { return greeting; }
    public void setName(String name) { this.name = name; }
    public void setGreeting(String greeting) { this.greeting = greeting; }
}
