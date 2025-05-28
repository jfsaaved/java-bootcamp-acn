package org.accenture.day06.lessons.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.accenture.day06.lessons.model.AggregatedData;
import org.accenture.day06.lessons.model.Data01;
import org.accenture.day06.lessons.model.Data02;
import org.accenture.day06.lessons.repository.Data01Repository;
import org.accenture.day06.lessons.repository.Data02Repository;
import org.accenture.day06.lessons.repository.EventLogger;
import org.accenture.day06.lessons.service.Data01Service;
import org.accenture.day06.lessons.service.Data02Service;

import java.util.UUID;

public class AggregatedDataController {
    private Data01Service data01Service;
    private Data02Service data02Service;
    private EventLogger eventLogger;

    public AggregatedDataController(Data01Repository data01Repository, Data02Repository data02Repository, EventLogger eventLogger) {
        this.data01Service = new Data01Service(data01Repository);
        this.data02Service = new Data02Service(data02Repository);
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
     *
     *  Assume: Data01.getData02Name() == Data02.getDataName()
     *  See Line 16 - 43 how this service is taking in data in simulation
     *
     *  Example:
     *
     *  Given:
     *  Data01 {
     *      uuid: 257e84bd-adae-4c4d-b931-c5e753fbc39b
     *      dataName: "Data01 Special Name"
     *      category: "Some Category"
     *      data02Name: "Data02 Special Name"
     *      createdAt: {someDate}
     *      updatedAt: {someDate}
     *  }
     *
     *  Data02 {
     *      uuid: b3fc9e27-2eb3-447b-85cf-b688f95c52fb
     *      dataName: "Data02 Special Name"
     *      type: "Some Type"
     *      someOtherId: cbbe686e-45c6-4a01-b28c-48c6a8338023
     *      createdAt: {someDate}
     *      updatedAt: {someDate}
     *  }
     *
     *  Input: 257e84bd-adae-4c4d-b931-c5e753fbc39b
     *
     *  To this method:
     *  getData(257e84bd-adae-4c4d-b931-c5e753fbc39b)
     *
     *  Returns:
     *  AggregatedData {
     *      Data01 {
     *          uuid: 257e84bd-adae-4c4d-b931-c5e753fbc39b
     *          dataName: "Data01 Special Name"
     *          category: "Some Category"
     *          data02Name: "Data02 Special Name"
     *          createdAt: {someDate}
     *          updatedAt: {someDate}
     *      },
     *      Data02 {
     *          uuid: b3fc9e27-2eb3-447b-85cf-b688f95c52fb
     *          dataName: "Data02 Special Name"
     *          type: "Some Type"
     *          someOtherId: cbbe686e-45c6-4a01-b28c-48c6a8338023
     *          createdAt: {someDate}
     *          updatedAt: {someDate}
     *      }
     *  }
    */
    public AggregatedData getData(UUID uuid) {
        return null;
    }
}
