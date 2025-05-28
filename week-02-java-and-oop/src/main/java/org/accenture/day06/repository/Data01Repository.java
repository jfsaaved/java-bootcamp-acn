package org.accenture.day06.repository;

import org.accenture.day06.model.Data01;

import java.util.UUID;

public interface Data01Repository {
    void saveData01(Data01 data01);
    Data01 getData01(UUID id);
}
