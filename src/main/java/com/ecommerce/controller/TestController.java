package com.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping
    public void testPayload(@RequestBody String payload) {
        System.out.println("Payload recebido como String: " + payload);
    }
}
