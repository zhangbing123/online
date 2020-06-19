package com.zb.onlineshop.user.controller;

import com.zb.redis.redisdemo.helper.RedisManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户控制类
 * @author: zhangbing
 * @create: 2019-03-15 15:58
 **/
@RequestMapping(value = "/user")
@RestController
public class UserController {

    @Autowired
    private RedisManager redisManager;

    @GetMapping(value = "/username")
    public String getRedis() {
        String name = (String) redisManager.get("name");

        if (StringUtils.isEmpty(name)) {
            name = "zhangsan";
            redisManager.set("name", name);
        }
        return name;
    }
}
