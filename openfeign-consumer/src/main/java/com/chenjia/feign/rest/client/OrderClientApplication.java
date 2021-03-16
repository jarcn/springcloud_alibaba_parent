package com.chenjia.ribbon.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OrderClientApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(OrderClientApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
