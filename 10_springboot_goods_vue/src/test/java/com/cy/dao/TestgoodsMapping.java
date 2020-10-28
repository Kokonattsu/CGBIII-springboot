package com.cy.dao;

import com.cy.pojo.Goods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestgoodsMapping {
    @Autowired
    GoodsMapper goodsMapper;

    @Test
    public void test() {

        List<Goods> list = goodsMapper.selectAll();

        Assertions.assertNotNull(list);
    }
}
