package org.accenture.client.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Configuration
public class ClientAppConfig {

    @Value("${keycloak.client-id}")
    private String clientId;

    @Value("${keycloak.client-secret}")
    private String clientSecret;

    @Value("${keycloak.token-uri}")
    private String tokenUri;

    @Value("${resource-server.url}")
    private String resourceServerUrl;
    private final RestTemplate tokenTemplate = new RestTemplate();

    public String getResourceServerUrl() {
        return resourceServerUrl;
    }
    @Bean("authorized-rest-template")
    public RestTemplate securedRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(bearerAuthInterceptor());
        return restTemplate;
    }

    @Bean("unauthorized-rest-template")
    public RestTemplate unsecuredRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    private ClientHttpRequestInterceptor bearerAuthInterceptor() {
        return (request, body, execution) -> {
            String token = getAccessToken();
            request.getHeaders().setBearerAuth(token);
            return execution.execute(request, body);
        };
    }

    private String getAccessToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        String body = "grant_type=client_credentials" +
                "&client_id=" + clientId +
                "&client_secret=" + clientSecret;

        HttpEntity<String> request = new HttpEntity<>(body, headers);

        ResponseEntity<Map> response = tokenTemplate.exchange(
                tokenUri,
                HttpMethod.POST,
                request,
                Map.class
        );

        return (String) response.getBody().get("access_token");
    }
}
