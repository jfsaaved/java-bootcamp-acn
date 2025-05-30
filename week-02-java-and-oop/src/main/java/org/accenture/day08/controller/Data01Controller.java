package org.accenture.day08.controller;

import org.accenture.day08.enums.Status;
import org.accenture.day08.logging.Logger;
import org.accenture.day08.model.Data01;
import org.accenture.day08.service.Data01Service;

import java.util.List;

public class Data01Controller {

    private Data01Service data01Service;
    private final Logger log = new Logger(Data01Controller.class);

    public Data01Controller(Data01Service data01Service) {
        this.data01Service = data01Service;
    }

    public Status putMethod(List<Data01> listOfData) {
        try {
            data01Service.sendDataMessage(listOfData);
        } catch (RuntimeException re) {
            log.error("Messages failed: %s items", listOfData.size());
            return Status.ERROR;
        }
        return Status.SUCCESS;
    }

}
