package org.accenture.day06.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.accenture.day06.model.BaseEntity;

public interface EventLogger {
    void saveLog(BaseEntity data) throws JsonProcessingException;

}
