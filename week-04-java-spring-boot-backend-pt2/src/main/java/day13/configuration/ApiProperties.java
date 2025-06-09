package day13.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiProperties {

    @Value("${greetings.api.url}")
    private String greetingsApiUrl;

    public String getGreetingsApiUrl() {
        return greetingsApiUrl;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
