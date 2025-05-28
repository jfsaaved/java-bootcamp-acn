package org.accenture.day06.service;

import org.accenture.day06.enums.Status;
import org.accenture.day06.utility.RestTemplate;

public class RequestService {
    private final RestTemplate restTemplate;

    public RequestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // TODO Handle exception here so that we return Status.ERROR on RuntimeException
    //  Use RequestServiceTest.java to test
    public Status makeRequest(Integer input) {
        return restTemplate.getRequest(input);
    }
}
