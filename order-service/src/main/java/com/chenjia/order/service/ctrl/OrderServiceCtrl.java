package com.chenjia.order.service.ctrl;

import com.chenjia.order.service.bean.Stock;
import com.chenjia.order.service.common.WarehouseServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author chenjia@joyveb.com
 * @Date 2021/3/12 下午6:12
 */
@RestController
public class OrderServiceCtrl {

    @Autowired
    private WarehouseServiceFeignClient serviceFeignClient;


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

    /**
     * 创建订单业务逻辑
     *
     * @param skuId         商品类别编号
     * @param salesQuantity 销售数量
     * @return
     */
    @GetMapping("/create_order")
    public Map createOrder(Long skuId, Long salesQuantity) {
        Map result = new LinkedHashMap();
        //查询商品库存，像调用本地方法一样完成业务逻辑。
        Stock stock = serviceFeignClient.getStock(skuId);
        System.out.println(stock);
        if (salesQuantity <= stock.getQuantity()) {
            //创建订单相关代码，此处省略
            //CODE=SUCCESS代表订单创建成功
            result.put("code", "SUCCESS");
            result.put("skuId", skuId);
            result.put("message", "订单创建成功");
        } else {
            //code=NOT_ENOUGN_STOCK代表库存不足
            result.put("code", "NOT_ENOUGH_STOCK");
            result.put("skuId", skuId);
            result.put("message", "商品库存数量不足");
        }
        return result;
    }


}
