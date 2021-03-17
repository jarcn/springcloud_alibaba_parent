package com.chenjia.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(OrderServiceApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
