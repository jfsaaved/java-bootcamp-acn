package org.accenture.day06.lessons.service;

import org.accenture.day06.lessons.enums.Status;
import org.accenture.day06.lessons.utility.RestTemplate;

public class CallingAnotherService {
    private RestTemplate restTemplate;

    public CallingAnotherService() {
        this.restTemplate = new RestTemplate();
    }

    // TODO Handle exception here so that we return Status.ERROR on RuntimeException
    public Status makeRequest() {
        return restTemplate.getRequest();
    }
}
