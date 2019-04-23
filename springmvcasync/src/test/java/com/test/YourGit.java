package com.test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class YourGit {
    public static void main(String[] args) {
        new Thread(()->{
            log.info("lombok is a good plugin for developers");
        }).start();

        log.info("lombok is a good plugin for developers");
    }
}
