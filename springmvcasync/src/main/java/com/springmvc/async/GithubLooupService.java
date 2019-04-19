package com.springmvc.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class GithubLooupService {
    private static final Logger logger = LoggerFactory.getLogger(GithubLooupService.class);

    private RestTemplate restTemplate;

    public GithubLooupService(RestTemplateBuilder restTemplate) {
        this.restTemplate = restTemplate.build();
    }

    @Async
    public CompletableFuture<User> findUser(String user) throws InterruptedException {
        logger.info("Looking up " + user);
        String url = String.format("https://api.github.com/users/%s", user);
        User result = restTemplate.getForObject(url, User.class);
        Thread.sleep(1000);
        return CompletableFuture.completedFuture(result);
    }
}
