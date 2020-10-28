package com.cy.pj.goods.service;

import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GoodsServiceTests {
    @Autowired
    private GoodsService service;

    @Autowired
    @Qualifier("goodsDaoImpl")
    private GoodsDao goodsDao;

    @Test
    void testGoodsService(){
        List<Goods> list = service.findGoods(goodsDao);
        for(Goods g:list){
            System.out.println(g);
        }
    }

}
