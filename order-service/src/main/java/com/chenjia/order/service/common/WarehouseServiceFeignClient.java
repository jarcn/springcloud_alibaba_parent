package com.chenjia.order.service.common;

import com.chenjia.order.service.bean.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author chenjia@joyveb.com
 * @Date 2021/3/17 上午10:14
 */
@FeignClient("warehouse-service")
public interface WarehouseServiceFeignClient {

    @GetMapping("/stock")
    Stock getStock(@RequestParam("skuId") Long skuId);

}
