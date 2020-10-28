package com.cy.pj.goods.dao;

import com.cy.pj.goods.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GoodsDaoTests {
    @Autowired
    //@Qualifier("goodsDaoImpl")
    private GoodsDao goodsDao;


    @Test
    void testFindGoods(){
        List<Goods> list=goodsDao.findGoods();
        for(Goods goods:list){
            System.out.println(goods);
        }

    }
}
