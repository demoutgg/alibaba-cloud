package com.demou.study.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author：lyx
 * @date: 2021/11/3 12:25 下午
 * @version: 1.0
 * feign 设置日志输出级别
 */
@Configuration
public class FeignLogConfiguration {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }


}