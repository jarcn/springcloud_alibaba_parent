package com.chenjia.ribbon.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonRestApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(RibbonRestApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
