package org.accenture.day11.service;

import org.accenture.day11.model.Greeting;
import org.accenture.day11.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Optional<Greeting> getGreetingById(Integer id){
        return greetingRepository.getGreetingByID(id);
    }

    public Greeting createGreeting(String greetingText) {
        Greeting greeting = new Greeting(null, greetingText);
        return greetingRepository.saveGreeting(greeting);
    }

    public Optional<Greeting> updateGreeting(Integer id, String greetingText) {
        return greetingRepository.getGreetingByID(id)
                .map(existing -> {
                    existing.setGreeting(greetingText);
                    return greetingRepository.saveGreeting(existing);
                });
    }

    public boolean deleteGreeting(Integer id) {
        if (greetingRepository.getGreetingByID(id).isPresent()) {
            greetingRepository.deleteGreetingByID(id);
            return true;
        }
        return false;
    }

}

