package org.accenture.day08.messaging;

import org.accenture.day08.model.Data01;

import java.util.List;

public interface MessageService {
    void sendToTopic(String topicName, Integer number);

    void sendToTopic(String topicName, List<Data01> data01List);

}
