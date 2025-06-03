package org.accenture.day11.model;
import javax.validation.constraints.NotBlank;

public class GreetingDTO {
    @NotBlank(message = "Greeting text is required")
    private String greeting;

    public GreetingDTO() {
    }

    public GreetingDTO(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}