package org.accenture.day10.controller;

import org.accenture.day10.service.GreetingService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String getGreeting(){
        return greetingService.getGreetingById(1);
    }
}
