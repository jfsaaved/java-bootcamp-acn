package org.accenture.day07.messaging;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.accenture.day07.logging.Logger;
import org.accenture.day07.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

import static org.accenture.day07.config.AppConfig.OBJECT_MAPPER;

public class MessageServiceImpl implements MessageService {

    private List<String> events;

    private final Logger log = new Logger(MessageServiceImpl.class);

    public MessageServiceImpl() {
        this.events = new ArrayList<>();
    }

    @Override
    public void sendToTopic(String topicName, Integer number) {
        try {
            Message message = new Message("Application", topicName, OBJECT_MAPPER.writeValueAsString(number));
            riskyMethod();
            topicSender(topicName, message);
        } catch (JsonProcessingException jpe) {
            log.error(jpe.getMessage());
        }
    }

    private void riskyMethod() {
        if (Math.random() % 2 == 0) {
            throw new RuntimeException();
        }
    }

    private void topicSender(String topicName, Message message) {
        log.info("Message sent topicName: %s ID: %s", topicName, message.getId());
        events.add(message.toString());
    }
}
