package com.server.assignment.clientserverproject;

import java.io.BufferedReader;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ClientServerProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServerProjectApplication.class, args);
    }
}
