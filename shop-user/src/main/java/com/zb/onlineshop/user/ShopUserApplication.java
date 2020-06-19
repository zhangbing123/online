package com.zb.onlineshop.user;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@Log4j2
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
//@ComponentScan(basePackages={"com.zb.redis"})
public class ShopUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopUserApplication.class, args);
        log.info("the user server start successfully!!!");
    }

}
