package com.demou.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author：lyx
 * @date: 2021/11/3 12:04 上午
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.demou.study.dao")
@EnableDiscoveryClient
public class StockApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(StockApplication.class,args);
    }
}
