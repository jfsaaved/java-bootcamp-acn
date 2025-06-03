package org.accenture.day11.controller;

import org.accenture.day11.model.Greeting;
import org.accenture.day11.model.GreetingDTO;
import org.accenture.day11.service.GreetingService;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;


@RestController
@RequestMapping("/greetings")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Greeting> getGreetingById(@PathVariable Integer id){
        return greetingService.getGreetingById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Greeting> createGreeting(@Valid @RequestBody GreetingDTO greetingDTO) {
        Greeting savedGreeting = greetingService.createGreeting(greetingDTO.getGreeting());
        URI location = URI.create("/greetings/" + savedGreeting.getId());
        return ResponseEntity.created(location).body(savedGreeting);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Greeting> updateGreeting(@PathVariable Integer id, @Valid @RequestBody GreetingDTO greetingDTO){
        return greetingService.updateGreeting(id, greetingDTO.getGreeting())
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteGreeting(@PathVariable Integer id) {
        boolean deleted = greetingService.deleteGreeting(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }


}
