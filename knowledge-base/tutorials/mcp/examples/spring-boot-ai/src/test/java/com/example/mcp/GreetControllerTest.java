package com.example.mcp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreetControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate rest;

    @Test
    void greetReturnsGreeting() {
        String url = "http://localhost:" + port + "/greet";
        ResponseEntity<Map> res = rest.postForEntity(url, Map.of("name", "Sam"), Map.class);
        assertThat(res.getStatusCodeValue()).isEqualTo(200);
        assertThat(res.getBody()).containsKey("greeting");
    }
}
