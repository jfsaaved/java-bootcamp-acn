package org.accenture.day08.service;

import org.accenture.day08.logging.Logger;
import org.accenture.day08.messaging.MessageService;
import org.accenture.day08.model.Data01;

import java.util.List;

import static org.accenture.day08.util.AppConstants.SUM_TOPIC;


public class Data01Service {
    private final MessageService messageService;
    private final static Logger log = new Logger(Data01Service.class);

    public Data01Service(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendDataMessage(List<Data01> listOfData) {
        List<Data01> finalList = listOfData;

        // TODO: Transform all Data01 names to uppercase or lowercase format

        // TODO: Format Data01 name as "{Name}-Test" for display

        // TODO: Filter Data01 objects whose name contains the character 'a' (case-insensitive)

        // TODO: Remove Data01 entries where id is below 500

        // TODO: Merge listOfNumbers from both Sub01Data01 and Sub02Data01 for each Data01 into a single combined list

        messageService.sendToTopic(SUM_TOPIC, finalList);
    }

}
