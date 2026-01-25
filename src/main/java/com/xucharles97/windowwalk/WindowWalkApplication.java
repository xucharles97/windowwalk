package com.xucharles97.windowwalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WindowWalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WindowWalkApplication.class, args);
    }

}
