package com.example.springgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MainController {

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback message");
    }
}
