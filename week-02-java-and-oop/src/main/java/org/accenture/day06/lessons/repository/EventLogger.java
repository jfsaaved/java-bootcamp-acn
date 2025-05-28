package org.accenture.day06.lessons.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.accenture.day06.lessons.model.BaseEntity;

public interface EventLogger {
    void saveLog(BaseEntity data) throws JsonProcessingException;

}
