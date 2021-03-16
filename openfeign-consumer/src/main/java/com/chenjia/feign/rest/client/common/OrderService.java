package com.chenjia.feign.rest.client.common;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author chenjia@joyveb.com
 * @Date 2021/3/12 下午6:26
 */
@FeignClient("order-service")
public interface OrderService {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name", defaultValue = "chenjia", required = false) String name);

    @GetMapping("/order")
    String order(@RequestParam(value = "orderId") String orderId);

}
