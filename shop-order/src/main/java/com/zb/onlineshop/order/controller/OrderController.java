package com.zb.onlineshop.order.controller;

import com.zb.onlineshop.order.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.composite.CompositeDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 订单服务
 * @author: zhangbing
 * @create: 2020-06-19 15:49
 **/
@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private UserService userService;
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping(value = "getUser")
    public String getUser() {
        int order = discoveryClient.getOrder();
//        List<DiscoveryClient> discoveryClients = ((CompositeDiscoveryClient) discoveryClient).getDiscoveryClients();
        List<String> services = discoveryClient.getServices();
        String username = userService.username();
        return username;
    }
}
