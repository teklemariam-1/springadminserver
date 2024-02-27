package com.tek.springadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringadminserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringadminserverApplication.class, args);
    }

}
