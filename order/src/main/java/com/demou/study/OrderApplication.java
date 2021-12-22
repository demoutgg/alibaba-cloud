package com.demou.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author：lyx
 * @date: 2021/11/3 12:04 上午 测试
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.demou.study.dao")
@EnableFeignClients
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
