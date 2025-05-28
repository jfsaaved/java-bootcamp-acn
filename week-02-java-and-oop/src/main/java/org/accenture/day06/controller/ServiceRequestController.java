package org.accenture.day06.controller;

import org.accenture.day06.enums.Status;
import org.accenture.day06.service.CallingAnotherService;

public class ServiceRequestController {
    private final CallingAnotherService callingAnotherService;
    public ServiceRequestController(CallingAnotherService callingAnotherService) {
        this.callingAnotherService = callingAnotherService;
    }
    public Status getRequest() {
        return callingAnotherService.makeRequest();
    }
}
