package org.accenture.day08.messaging;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.accenture.day08.logging.Logger;
import org.accenture.day08.model.Data01;
import org.accenture.day08.model.Message;
import org.accenture.day08.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

import static org.accenture.day08.config.AppConfig.OBJECT_MAPPER;

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

    @Override
    public void sendToTopic(String topicName, List<Data01> list) {
        try {
            Message message = new Message("Application", topicName, OBJECT_MAPPER.writeValueAsString(list));
            riskyMethod();
            topicSender(topicName, message);
        } catch (JsonProcessingException jpe) {
            log.error(jpe.getMessage());
        }
    }

    private void riskyMethod() {
        if (RandomGenerator.RANDOM.nextInt(100) < 10) {
            throw new RuntimeException();
        }
    }

    private void topicSender(String topicName, Message message) {
        log.info("Message sent topicName: %s ID: %s", topicName, message.getId());
        events.add(message.toString());
    }
}
