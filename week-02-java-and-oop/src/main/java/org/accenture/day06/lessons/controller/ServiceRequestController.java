package org.accenture.day06.lessons.controller;

import org.accenture.day06.lessons.enums.Status;
import org.accenture.day06.lessons.service.CallingAnotherService;

public class ServiceRequestController {
    private CallingAnotherService callingAnotherService;
    public ServiceRequestController(CallingAnotherService callingAnotherService) {
        this.callingAnotherService = callingAnotherService;
    }
    public Status getRequest() {
        return callingAnotherService.makeRequest();
    }
}
