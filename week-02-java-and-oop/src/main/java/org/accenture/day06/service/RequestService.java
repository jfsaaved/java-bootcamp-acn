package org.accenture.day06.service;

import org.accenture.day06.enums.Status;
import org.accenture.day06.utility.RestTemplate;

public class RequestService {
    private RestTemplate restTemplate;

    public RequestService() {
        this.restTemplate = new RestTemplate();
    }

    // TODO Handle exception here so that we return Status.ERROR on RuntimeException
    public Status makeRequest() {
        return restTemplate.getRequest();
    }
}
