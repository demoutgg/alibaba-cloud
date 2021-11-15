package com.demou.study.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author：lyx
 * @date: 2021/11/3 9:36 上午
 * @version: 1.0
 * name对应消费api nacos服务名
 * path对应消费服务的controller的RequestMapping
 */
@FeignClient(name = "stock-service",path = "/stock")
public interface StockFeignService {

    /**
     * 对应服务提供方接口
     * @return
     */
    @RequestMapping("/reduct")
    String reduct(@RequestParam("id") int id);

}