package com.tinghai.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {
    @Value("${user.name}")
    private String name;

    @Test
    void contextLoads() {
        System.out.println("helloWorld" + name);
    }

}
