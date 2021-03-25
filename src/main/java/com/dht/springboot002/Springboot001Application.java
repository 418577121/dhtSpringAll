package com.dht.springboot002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = {"com.dht.springboot002.mapper"})
@SpringBootApplication
public class Springboot001Application {
    //我新加了一行
    //test
    //我测试冲突
    public static void main(String[] args) {
        SpringApplication.run(Springboot001Application.class, args);
    }

}
