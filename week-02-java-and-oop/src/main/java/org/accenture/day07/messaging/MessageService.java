package org.accenture.day07.messaging;

public interface MessageService {
    void sendToTopic(String topicName, Integer number);

}
