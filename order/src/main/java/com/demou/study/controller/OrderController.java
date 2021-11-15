package com.demou.study.controller;

import com.demou.study.entity.Order;
import com.demou.study.feign.StockFeignService;
import com.demou.study.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：lyx
 * @date: 2021/11/3 9:25 上午
 * @version: 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;
    @Autowired
    OrderService orderService;

    @RequestMapping("/add/{id}")
    @GlobalTransactional
    public String add(@PathVariable int id) throws ClassNotFoundException {
        System.out.println("下单操作");
        Order order = new Order();
        order.setOrderId(id + "");
        order.setProdId(1);
        order.setRemark("lyx test 第" + id + "次。");
        //插入订单
        orderService.insert(order);
        //调用微服务进行库存删减
        String reduct = stockFeignService.reduct(id);
        System.out.println(reduct);
        //抛出异常
        int i = 1 / 0;
        return "1";
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("123"+"\n"+"456");
        System.out.println(sb.toString());
    }

}