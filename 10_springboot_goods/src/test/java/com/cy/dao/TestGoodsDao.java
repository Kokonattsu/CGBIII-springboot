package com.cy.dao;

import com.cy.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestGoodsDao {
    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void TestGoodsDao(){
        List<Goods> list = goodsDao.findGoods();
        for (Goods g:list){
            System.out.println(g);
        }
    }
}
