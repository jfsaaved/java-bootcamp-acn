package org.accenture.day06.utility;

import org.accenture.day06.enums.Status;

import java.util.Random;

/**
 * Ignore this class.
 * This class simulates a request to another Microservice
 */
public class RestTemplate {

    /**
     * Return SUCCESS or throw an exception
     * when randomInteger > 15 == true
     */
    public Status getRequest() {
        int randomInteger = new Random().nextInt(20);
        if (randomInteger > 15) throw new RuntimeException();
        return Status.SUCCESS;
    }

    public RestTemplate() {

    }
}
