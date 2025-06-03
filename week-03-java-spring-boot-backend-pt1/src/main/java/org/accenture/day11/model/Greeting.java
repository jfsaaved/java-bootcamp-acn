package org.accenture.day11.model;

import javax.validation.constraints.NotBlank;


public class Greeting {

    private Integer id;

    @NotBlank(message = "Greeting text must not be blank")
    private String greeting;

    public Greeting(Integer id, String greeting){
        this.id = id;
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}