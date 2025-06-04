package org.accenture.day11.repository;

import org.accenture.day11.model.Greeting;

import java.util.Optional;

public interface GreetingRepository {
    Optional<Greeting> getGreetingByID(Integer id);
    Greeting saveGreeting(Greeting greeting);
    void deleteGreetingByID(Integer id);
}

