package com.zb.onlineshop.eureka;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动注册中心
 */

@Log4j2
@EnableEurekaServer
@SpringBootApplication
public class ShopEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopEurekaApplication.class, args);
        log.info("the eureka server start successfully!!!");
    }

}
