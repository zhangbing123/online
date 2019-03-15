package com.zb.onlineshop.user.controller;

import com.zb.redis.redisdemo.helper.RedisManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户控制类
 * @author: zhangbing
 * @create: 2019-03-15 15:58
 **/
@RestController
public class UserController {

    @Autowired
    private RedisManager redisManager;

    @RequestMapping(value = "/user/getRedis",method = RequestMethod.GET)
    public String getRedis(){
        String string = (String) redisManager.get("name");
        return string;
    }
}
