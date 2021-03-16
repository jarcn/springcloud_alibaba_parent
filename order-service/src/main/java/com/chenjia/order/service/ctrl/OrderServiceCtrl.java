package com.chenjia.order.service.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenjia@joyveb.com
 * @Date 2021/3/12 下午6:12
 */
@RestController
public class OrderServiceCtrl {


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "chenjia", required = false) String name) {
        System.out.println("请求参数:" + name);
        return "hi " + name;
    }

    @GetMapping("/order")
    public String order(@RequestParam(value = "orderId") String orderId) {
        System.out.println("订单系统:" + orderId);
        return "下单成功";
    }


}
