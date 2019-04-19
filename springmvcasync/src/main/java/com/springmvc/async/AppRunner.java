package com.springmvc.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private GithubLooupService githubLooupService;

    public AppRunner(GithubLooupService githubLooupService) {
        this.githubLooupService = githubLooupService;
    }

    @Override
    public void run(String... args) throws Exception {
        long start = System.currentTimeMillis();

        CompletableFuture<User> pivotalSoftware = githubLooupService.findUser("PivotalSoftware");
        CompletableFuture<User> cloudFoundry = githubLooupService.findUser("CloudFoundry");
        CompletableFuture<User> SpringProjects = githubLooupService.findUser("Spring-Projects");

        CompletableFuture.allOf(pivotalSoftware, cloudFoundry, SpringProjects).join();

        System.out.println("elapsed time " + (System.currentTimeMillis()-start));
        logger.info("--> "+ pivotalSoftware.get());
        logger.info("--> "+ cloudFoundry.get());
        logger.info("--> "+ SpringProjects.get());

        logger.info("--> "+ pivotalSoftware.get());
        logger.info("--> "+ cloudFoundry.get());
        logger.info("--> "+ SpringProjects.get());

    }
}
