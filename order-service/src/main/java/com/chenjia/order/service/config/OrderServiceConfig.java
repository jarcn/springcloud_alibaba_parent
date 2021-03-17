package com.chenjia.order.service.config;

import okhttp3.ConnectionPool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * 使用okhttpClient替换feign默认的URLConnection通信工具类
 * 也可以使用HttpClient
 *
 * @Author chenjia@joyveb.com
 * @Date 2021/3/17 上午10:30
 */
@Configuration
public class OrderServiceConfig {
    @Bean
    public okhttp3.OkHttpClient okHttpClient() {
        return new okhttp3.OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)//读取超时时间
                .connectTimeout(10, TimeUnit.SECONDS)//连接超时时间
                .writeTimeout(10, TimeUnit.SECONDS)//写超时时间
                .connectionPool(new ConnectionPool())//设置连接池
                .build();
    }
}
