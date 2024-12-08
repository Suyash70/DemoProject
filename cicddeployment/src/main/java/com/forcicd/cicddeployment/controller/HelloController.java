package com.forcicd.cicddeployment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3003")
public class HelloController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from Spring Boot!";
    }

    @PostMapping("/message")
    public String postMessage(@RequestBody String message) {
        System.out.println("Received message: " + message);
        return "Message received: " + message;
    }
}
