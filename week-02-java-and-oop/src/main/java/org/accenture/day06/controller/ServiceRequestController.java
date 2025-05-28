package org.accenture.day06.controller;

import org.accenture.day06.enums.Status;
import org.accenture.day06.service.RequestService;

public class ServiceRequestController {
    private final RequestService requestService;
    public ServiceRequestController(RequestService requestService) {
        this.requestService = requestService;
    }
    public Status getRequest() {
        return requestService.makeRequest();
    }
}
