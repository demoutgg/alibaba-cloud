package com.demou.study.controller;

import com.demou.study.entity.Stock;
import com.demou.study.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * @author：lyx
 * @date: 2021/11/3 9:30 上午
 * @version: 1.0
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;

    @Autowired
    StockService stockService;

    @RequestMapping("/reduct")
    @Transactional
    public String reduct(@RequestParam int id) {
        Stock stock = new Stock();
        stock.setProdId("" + id);
        stockService.updateByPrimaryKey(stock);
        return id + " 扣减库存成功!! in : " + port;
    }

}