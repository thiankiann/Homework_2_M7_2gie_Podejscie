package com.example.homework_2_m7_2gie_podejscie.proxy;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Log4j2
@Component
public class GitHubServerProxy {

    @Autowired
    RestTemplate restTemplate;

    @Value("api.github.com")
    String url;

    public GitHubServerProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public String makeGetRequest(String username) {
        UriComponentsBuilder builder = UriComponentsBuilder
                .newInstance()
                .scheme("https")
                .host(url)
                .path("/users/" + username + "/repos");

        try {
            ResponseEntity<String> response = restTemplate.exchange(
                    builder.build().toUri(),
                    HttpMethod.GET,
                    null,
                    String.class
            );
            return response.getBody();
        } catch (IllegalArgumentException ex) {
            log.error("User: " + username + " not found");
        }
        return null;
    }
}
