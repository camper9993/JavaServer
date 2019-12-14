package com.handtruth.javaschool.server;

import com.handtruth.javaschool.server.configs.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class[] {ServerApplication.class, AppConfig.class}, args);
    }

}
