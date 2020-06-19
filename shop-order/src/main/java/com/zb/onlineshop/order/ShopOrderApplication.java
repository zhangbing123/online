package com.zb.onlineshop.order;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 订单服务
 */
@Log4j2
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ShopOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopOrderApplication.class, args);
        log.info("the order server start successfully!!!");
    }

}
