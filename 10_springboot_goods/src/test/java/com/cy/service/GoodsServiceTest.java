package com.cy.service;

import com.cy.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GoodsServiceTest {
    @Autowired
    GoodsService goodsService;

    @Test
    void TestfindGoods(){
        List<Goods> goodsList = goodsService.findGoods();

    }
}
