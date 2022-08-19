package com.example.intervieeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IntervieEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntervieEurekaApplication.class, args);
    }

}
