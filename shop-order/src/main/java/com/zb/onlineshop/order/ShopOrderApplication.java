package com.zb.onlineshop.order;

import com.zb.onlineshop.common.utils.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShopOrderApplication {

    public static void main(String[] args) {
        StringUtils.toStrings();
        SpringApplication.run(ShopOrderApplication.class, args);
    }

}
