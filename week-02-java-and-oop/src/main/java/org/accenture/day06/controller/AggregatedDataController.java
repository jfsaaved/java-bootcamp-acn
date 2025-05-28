package org.accenture.day06.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.accenture.day06.model.AggregatedData;
import org.accenture.day06.model.Data01;
import org.accenture.day06.model.Data02;
import org.accenture.day06.repository.EventLogger;
import org.accenture.day06.service.Data01Service;
import org.accenture.day06.service.Data02Service;

import java.util.UUID;

public class AggregatedDataController {
    private final Data01Service data01Service;
    private final Data02Service data02Service;
    private final EventLogger eventLogger;

    public AggregatedDataController(Data01Service data01Service, Data02Service data02Service, EventLogger eventLogger) {
        this.data01Service = data01Service;
        this.data02Service = data02Service;
        this.eventLogger = eventLogger;
    }

    public void postData(Data01 data01, Data02 data02) throws JsonProcessingException {
        data01Service.addIncomingData(data01);
        eventLogger.saveLog(data01);
        data02Service.addIncomingData(data02);
        eventLogger.saveLog(data02);
    }

    /**
     * TODO Return an aggregated data with Data01 UUID as parameter
     *  Update the Service classes when needed
     *  Use AggregatedDataControllerTest.java to test
     * <p>
     * Assume: Data01.getData02Name() == Data02.getDataName()
     * See Line 16 - 43 how this service is taking in data in simulation
     * <p>
     * Example:
     * <p>
     * Given:
     * Data01 {
     * uuid: 257e84bd-adae-4c4d-b931-c5e753fbc39b
     * dataName: "Data01 Special Name"
     * category: "Some Category"
     * data02Name: "Data02 Special Name"
     * createdAt: {someDate}
     * updatedAt: {someDate}
     * }
     * <p>
     * Data02 {
     * uuid: b3fc9e27-2eb3-447b-85cf-b688f95c52fb
     * dataName: "Data02 Special Name"
     * type: "Some Type"
     * someOtherId: cbbe686e-45c6-4a01-b28c-48c6a8338023
     * createdAt: {someDate}
     * updatedAt: {someDate}
     * }
     * <p>
     * Input: 257e84bd-adae-4c4d-b931-c5e753fbc39b
     * <p>
     * To this method:
     * getData(257e84bd-adae-4c4d-b931-c5e753fbc39b)
     * <p>
     * Returns:
     * AggregatedData {
     * Data01 {
     * uuid: 257e84bd-adae-4c4d-b931-c5e753fbc39b
     * dataName: "Data01 Special Name"
     * category: "Some Category"
     * data02Name: "Data02 Special Name"
     * createdAt: {someDate}
     * updatedAt: {someDate}
     * },
     * Data02 {
     * uuid: b3fc9e27-2eb3-447b-85cf-b688f95c52fb
     * dataName: "Data02 Special Name"
     * type: "Some Type"
     * someOtherId: cbbe686e-45c6-4a01-b28c-48c6a8338023
     * createdAt: {someDate}
     * updatedAt: {someDate}
     * }
     * }
     */
    public AggregatedData getData(UUID uuid) {
        return null;
    }
}
