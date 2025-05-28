package org.accenture.day06.utility;

import org.accenture.day06.enums.Status;

import java.util.Random;

/**
 * This class simulates a request to another Microservice
 */
public class RestTemplate {
    /**
     * Simulating a bunch of scenarios
     * Avoid touching this class & method
     */
    public Status getRequest(Integer input) {
        switch (input) {
            case 1:
                return Status.SUCCESS;
            case 2:
                return Status.ERROR;
            case 3:
                int randomInteger = new Random().nextInt(20);
                if (randomInteger > 15) throw new RuntimeException();
                return Status.SUCCESS;
        }
        return Status.ERROR;
    }

    public RestTemplate() {

    }
}
