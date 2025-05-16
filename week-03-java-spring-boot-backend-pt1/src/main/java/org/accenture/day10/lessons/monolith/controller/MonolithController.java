package org.accenture.day10.lessons.monolith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonolithController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, world!";
    }
}
