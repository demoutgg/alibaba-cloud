package com.demou.study.service;

import com.demou.study.entity.Order;

/**
 * @author: lyx
 * @date: 2021/11/4 10:14 上午 测试
 * @version: 1.0
 */
public interface OrderService {

    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);


}

