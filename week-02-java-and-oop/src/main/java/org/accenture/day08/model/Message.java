package org.accenture.day08.model;


import java.time.Instant;
import java.util.UUID;

public class Message {
    private String id;
    private String sender;
    private String recipient;
    private String content;
    private Instant timestamp;

    public Message(String sender, String recipient, String content) {
        this.id = UUID.randomUUID().toString();
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.timestamp = Instant.now();
    }

    public String getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

}