package com.cy.pj.goods.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.ws.soap.Addressing;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class GoodsDaoTests {
    @Autowired
    private DefaultGoodsDao defaultGoodsDao;
    @Test
    void testFindGoods(){
        List<Map<String,Object>> list=defaultGoodsDao.findGoods();
        for(Map<String,Object> map:list){
            System.out.println(map);
        }
    }
}
