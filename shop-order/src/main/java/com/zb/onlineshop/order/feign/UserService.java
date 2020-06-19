package com.zb.onlineshop.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 用户中心服务
 * @author: zhangbing
 * @create: 2020-06-19 15:39
 **/
@FeignClient(name = "shopuser")
@RequestMapping(value = "user")
public interface UserService {

    /**
     * test
     * 通过feignClient 尝试调用用户服务
     * @return
     */
    @RequestMapping(value = "/username")
    String username();
}
