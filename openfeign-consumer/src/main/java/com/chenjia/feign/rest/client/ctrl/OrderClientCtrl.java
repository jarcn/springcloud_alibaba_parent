package com.chenjia.feign.rest.client.ctrl;

import com.chenjia.feign.rest.client.common.OrderService;
import com.chenjia.feign.rest.client.common.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenjia@joyveb.com
 * @Date 2021/3/12 下午6:12
 */
@RestController
public class OrderClientCtrl {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "chenjia", required = false) String name) {
        return orderService.hello(name);
    }

    @GetMapping("/orderQueryById")
    public String orderQueryById(@RequestParam(value = "orderId") String orderId) {
        return orderService.order(orderId);
    }

    @GetMapping("/orderAndPay")
    public Object orderAndPay(@RequestParam(value = "orderId") String orderId) {
        String order = orderService.order(orderId);
        String payOrder = payService.payOrder(orderId);
        return order + "\r\n" + payOrder;
    }


}
