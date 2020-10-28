package com.cy.service;

import com.cy.dao.GoodsMapper;
import com.cy.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceImpl implements Service{
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List selectAll() {
        List<Goods> list = goodsMapper.selectAll();
        return list;
    }

    @Override
    public Integer insert(Object object) {

        return null;
    }

    @Override
    public Integer update(Object object) {
        return null;
    }

    @Override
    public Integer deleteById(Integer Id) {
        return null;
    }
}
