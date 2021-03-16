package com.chenjia.feign.rest.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignClientApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(FeignClientApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
