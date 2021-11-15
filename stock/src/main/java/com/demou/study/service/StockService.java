package com.demou.study.service;

import com.demou.study.entity.Stock;

/**
 * @author: lyx
 * @date: 2021/11/5 10:45 上午
 * @version: 1.0
 */
public interface StockService {

    int deleteByPrimaryKey(String id);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);

}
