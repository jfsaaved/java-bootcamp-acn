package org.accenture.day10.service;

import org.accenture.day10.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreetingById(Integer id){
        return greetingRepository.getGreetingByID(id).getGreeting();
    }

}
