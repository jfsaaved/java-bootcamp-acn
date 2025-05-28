package org.accenture.day06.service;

import org.accenture.day06.enums.Status;
import org.accenture.day06.utility.RestTemplate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class RequestServiceTest {

    private RestTemplate restTemplate;
    private RequestService requestService;
    @BeforeEach
    void init() {
        this.restTemplate = new RestTemplate();
        this.requestService = new RequestService(restTemplate);
    }

    @Test
    void Make_sure_success_flow_does_not_break() {
        Status actualStatus = requestService.makeRequest(1);
        assertEquals(Status.SUCCESS, actualStatus);
    }

    @Test
    void Make_sure_error_flow_does_not_break() {
        Status actualStatus = requestService.makeRequest(2);
        assertEquals(Status.ERROR, actualStatus);
    }

    @Test
    void Fix_the_method_so_this_does_not_fail() {
        for (int i = 0; i < 100; i++) {
            assertDoesNotThrow(() -> {
                Status result = requestService.makeRequest(3);
                assertTrue(result != null);
            });
        }
    }
}
