package org.accenture.day12.controller;

import org.accenture.day12.model.GreetingResponseDTO;
import org.accenture.day12.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/greetings")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<GreetingResponseDTO> getGreetingById(@PathVariable Integer id) {
        return greetingService.getGreetingById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<GreetingResponseDTO>> getAllGreetings() {
        return ResponseEntity.ok(greetingService.findAllGreetings());
    }

}
