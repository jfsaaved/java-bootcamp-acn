package org.accenture.day10.repository;

import org.accenture.day10.model.Greeting;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryGreetingRepository implements GreetingRepository{
    private final Map<Integer, Greeting> greetings = new HashMap<>();

    public InMemoryGreetingRepository() {
        greetings.put(1, new Greeting(1, "Hello, World!"));
        greetings.put(2, new Greeting(2, "Another greeting!"));
    }

    @Override
    public Greeting getGreetingByID(Integer id) {
        return greetings.get(id);
    }

}
