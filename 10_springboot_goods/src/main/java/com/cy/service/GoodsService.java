package com.cy.service;

import com.cy.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findGoods();

    Goods findById(Integer id);

    Integer deleteById(Integer id);

    Integer insert(Goods goods);

    Integer update(Goods goods);
}
