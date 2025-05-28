package org.accenture.day06.service;

import org.accenture.day06.model.Data01;
import org.accenture.day06.repository.Data01Repository;

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
