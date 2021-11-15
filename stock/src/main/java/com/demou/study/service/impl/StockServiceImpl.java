package com.demou.study.service.impl;

import com.demou.study.dao.StockMapper;
import com.demou.study.entity.Stock;
import com.demou.study.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author：lyx
 * @date: 2021/11/5 10:48 上午
 * @version: 1.0
 */
@Service
public class StockServiceImpl implements StockService {

    @Resource
    StockMapper stockMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Stock record) {
        return 0;
    }

    @Override
    public int insertSelective(Stock record) {
        return 0;
    }

    @Override
    public Stock selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Stock record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Stock record) {
        return stockMapper.updateByPrimaryKey(record);
    }
}