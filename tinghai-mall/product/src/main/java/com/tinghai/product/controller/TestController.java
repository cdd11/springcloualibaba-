package com.tinghai.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.tinghai.utils.TestUtil;

/**
 * @author chendoudou
 * @description
 * @date 2023/6/7 17:21
 **/
@RestController
@RefreshScope
@RequestMapping("/product")
public class TestController {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private String age;

    @RequestMapping("/hello")
    public String helloWorld() {
        return name + "，我的年龄" + age;
    }
}
