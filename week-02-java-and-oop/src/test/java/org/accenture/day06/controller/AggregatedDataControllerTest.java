package org.accenture.day06.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.accenture.day06.model.AggregatedData;
import org.accenture.day06.model.Data01;
import org.accenture.day06.model.Data02;
import org.accenture.day06.repository.EventLogger;
import org.accenture.day06.service.Data01Service;
import org.accenture.day06.service.Data02Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AggregatedDataControllerTest {

    private Data01Service data01Service;
    private Data02Service data02Service;
    private EventLogger eventLogger;
    private AggregatedDataController aggregatedDataController;

    @BeforeEach
    void init() {
        this.data01Service = mock(Data01Service.class);
        this.data02Service = mock(Data02Service.class);
        this.eventLogger = mock(EventLogger.class);

        this.aggregatedDataController = new AggregatedDataController(data01Service, data02Service, eventLogger);
    }

    @Test
    void Test_services_are_called_correctly() throws JsonProcessingException {
        Data01 data01 = new Data01();
        Data02 data02 = new Data02();
        aggregatedDataController.postData(data01, data02);
        verify(data01Service).addIncomingData(data01);
        verify(eventLogger).saveLog(data01);
        verify(data02Service).addIncomingData(data02);
        verify(eventLogger).saveLog(data02);
    }

    @Test
    void Fix_when_get_method_should_return_what_has_been_added() throws JsonProcessingException {
        Data01 data01 = new Data01();
        Data02 data02 = new Data02();
        UUID someUUID = UUID.randomUUID();
        String data02Name = "Data02 Name";
        data01.setUuid(someUUID);
        data01.setData02Name(data02Name);
        data02.setDataName(data02Name);

        when(data01Service.getData01ByUUID(someUUID)).thenReturn(data01);
        when(data02Service.getData02ByName(data02Name)).thenReturn(data02);

        AggregatedData aggregatedDataResult = aggregatedDataController.getData(someUUID);

        assertEquals(someUUID,aggregatedDataResult.getData01().getUuid());
        assertEquals(data02Name,aggregatedDataResult.getData02().getDataName());
    }
}
