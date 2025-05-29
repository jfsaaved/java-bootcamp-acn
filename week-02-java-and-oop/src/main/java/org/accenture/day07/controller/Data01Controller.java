package org.accenture.day07.controller;

import org.accenture.day07.enums.Status;
import org.accenture.day07.logging.Logger;
import org.accenture.day07.model.Data01;
import org.accenture.day07.service.Data01Service;

public class Data01Controller {

    private Data01Service data01Service;
    private final Logger log = new Logger(Data01Controller.class);

    public Data01Controller(Data01Service data01Service) {
        this.data01Service = data01Service;
    }

    public Status putMethod(Data01 data01) {
        try {
            data01Service.sendDataMessage(data01);
        } catch (RuntimeException re) {
            log.error("Message failed: %s %s", data01.getId(), data01.getDataName());
            return Status.ERROR;
        }
        log.error("Message failed: %s %s", data01.getId(), data01.getDataName());
        return Status.SUCCESS;
    }

}
