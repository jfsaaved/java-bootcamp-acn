package org.accenture.day06.service;

import org.accenture.day06.model.Data02;
import org.accenture.day06.repository.Data02Repository;

public class Data02Service {
    private Data02Repository data02Repository;

    public Data02Service(Data02Repository data02Repository) {
        this.data02Repository = data02Repository;
    }

    public void addIncomingData(Data02 data02) {
        data02Repository.saveData02(data02);
    }

}
