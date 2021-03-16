package com.chenjia.feign.rest.client;

import com.chenjia.feign.rest.client.common.MyLoadBalance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@RibbonClient(name = "order-service", configuration = {MyLoadBalance.class})
public class FeignClientApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(FeignClientApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
