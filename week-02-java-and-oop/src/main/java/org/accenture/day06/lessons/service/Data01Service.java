package org.accenture.day06.lessons.service;

import org.accenture.day06.lessons.model.Data01;
import org.accenture.day06.lessons.repository.Data01Repository;

import java.util.UUID;

public class Data01Service {

    private Data01Repository data01Repository;

    public Data01Service(Data01Repository data01Repository) {
        this.data01Repository = data01Repository;
    }
    public void addIncomingData(Data01 data01) {
        if (data01.getUuid() != null) data01Repository.saveData01(data01);
        else System.out.println("Missing UUID.");
    }

}
