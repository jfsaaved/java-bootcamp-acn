package org.accenture.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApp {

    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class);
    }

    // TODO Create a controller that will call the resource server application
    //  using secured rest template from the configuration class
}
