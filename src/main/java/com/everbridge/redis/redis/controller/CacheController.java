package com.everbridge.redis.redis.controller;

import com.everbridge.redis.redis.config.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/caches")
public class CacheController {

    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("/test")
    public String  test(){
        redisUtils.set("123", "hello world");
        System.out.println("Start in");
        String string= redisUtils.get("123").toString();
        return string;
    }

}
