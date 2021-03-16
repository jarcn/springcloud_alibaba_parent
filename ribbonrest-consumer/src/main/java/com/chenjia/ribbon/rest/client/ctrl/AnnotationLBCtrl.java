package com.chenjia.ribbon.rest.client.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * @Author chenjia@joyveb.com
 * @Date 2021/3/16 上午10:00
 */

@RestController
public class AnnotationLBCtrl {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/anontation/order")
    public String anontationLB() {
        //关键点：将原有IP:端口替换为服务名
        //RestTemplate便会在通信前自动利用Ribbon查询可用provider-service实例列表
        //再根据负载均衡策略选择节点实例
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        String result = restTemplate.getForObject("http://order-service/order/?orderId=" + id, String.class);
        System.out.println("consumer-service获得数据:" + result);
        return "consumer-service获得数据:" + result;
    }
}
