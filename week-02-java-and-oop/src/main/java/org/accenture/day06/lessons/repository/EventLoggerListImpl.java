package org.accenture.day06.lessons.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accenture.day06.lessons.model.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class EventLoggerListImpl implements EventLogger {

    private List<String> listDatabase;

    public EventLoggerListImpl() {
        listDatabase = new ArrayList<>();
    }

    @Override
    public void saveLog(BaseEntity data) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        listDatabase.add(objectMapper.writeValueAsString(data));
    }

    public List<String> getAll() {
        return listDatabase;
    }
}
