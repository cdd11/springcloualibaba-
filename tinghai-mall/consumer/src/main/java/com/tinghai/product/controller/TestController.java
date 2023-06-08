package com.tinghai.product.controller;

import com.tinghai.product.feign.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendoudou
 * @description
 * @date 2023/6/7 17:21
 **/
@RestController
@RequestMapping("/consumer")
public class TestController {

    @Autowired
    private HelloClient helloClient;
    @RequestMapping("/hello")
    public String helloWorld() {
        return helloClient.helloWorld();
    }

}
