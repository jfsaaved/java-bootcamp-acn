package org.accenture.day11.repository;

import org.accenture.day11.model.Greeting;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class InMemoryGreetingRepository implements GreetingRepository{
    private final Map<Integer, Greeting> greetings = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger(1);

    public InMemoryGreetingRepository() {
    }

    @Override
    public Optional<Greeting> getGreetingByID(Integer id) {
        return Optional.ofNullable(greetings.get(id));
    }

    @Override
    public Greeting saveGreeting(Greeting greeting) {
        if (greeting.getId() == null) {
            greeting.setId(idCounter.getAndIncrement()); // new ID for new greeting
        }
        greetings.put(greeting.getId(), greeting);
        return greeting;
    }

    @Override
    public void deleteGreetingByID(Integer id) {
        greetings.remove(id);
    }


}
