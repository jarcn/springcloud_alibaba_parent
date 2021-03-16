package com.chenjia.feign.rest.client.common;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author chenjia@joyveb.com
 * @Date 2021/3/12 下午6:26
 */
@FeignClient("pay-service")
public interface PayService {

    @GetMapping("/payOrder")
    String payOrder(@RequestParam(value = "orderId") String orderId);

}
