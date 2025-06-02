package org.accenture.day10.repository;

import org.accenture.day10.model.Greeting;

public interface GreetingRepository {
    Greeting getGreetingByID(Integer id);
}
