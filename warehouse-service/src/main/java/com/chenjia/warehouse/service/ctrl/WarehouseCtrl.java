package com.chenjia.warehouse.service.ctrl;

import com.chenjia.warehouse.service.bean.Stock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author chenjia@joyveb.com
 * @Date 2021/3/12 下午6:12
 */
@RestController
public class WarehouseCtrl {

    @Value("${server.port}")
    private Integer servPort;

    /**
     * 查询对应 skuId 的库存状况
     *
     * @param skuId skuId
     * @return Stock 库存对象
     */
    @GetMapping("/stock")
    public Stock getStock(Long skuId) {
        Stock stock = null;
        if (skuId == 1101l) {
            //模拟有库存商品
            stock = new Stock(1101l, "Apple iPhone 11 128GB 紫色", 32, "台");
            stock.setDescription("Apple 11 紫色版对应商品描述");
        } else if (skuId == 1102l) {
            //模拟无库存商品
            stock = new Stock(1101l, "Apple iPhone 11 256GB 白色", 0, "台");
            stock.setDescription("Apple 11 白色版对应商品描述");
        } else {
            //演示案例，暂不考虑无对应 skuId 的情况
        }
        System.out.println("库存服务:" + servPort + "请求成功");
        return stock;
    }


}
