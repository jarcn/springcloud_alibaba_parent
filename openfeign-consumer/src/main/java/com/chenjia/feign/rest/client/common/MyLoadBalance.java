package com.chenjia.feign.rest.client.common;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author chenjia@joyveb.com
 * @Date 2021/3/16 下午3:55
 */
@Configuration
public class MyLoadBalance {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
