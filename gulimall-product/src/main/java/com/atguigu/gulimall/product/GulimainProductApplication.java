package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimainProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimainProductApplication.class, args);
    }

}
