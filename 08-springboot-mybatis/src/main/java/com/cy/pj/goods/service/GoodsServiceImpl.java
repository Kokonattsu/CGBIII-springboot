package com.cy.pj.goods.service;

import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.pojo.Goods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service//业务逻辑层注解
public class GoodsServiceImpl implements GoodsService{
    //
    private static final Logger log=
            LoggerFactory.getLogger(GoodsServiceImpl.class);


    private Long staertTime=null;
    private Long runTime=null;
    @Override
    public List<Goods> findGoods(GoodsDao goodsDao) {
        staertTime=System.nanoTime();
        List<Goods> list=goodsDao.findGoods();
        Long endTime=System.nanoTime();
        runTime=endTime-staertTime;

        log.info("findGoods().runTime={}",runTime);

        return list;
    }

    public void runTime(){
        System.out.println("findGoods().runTime="+runTime);
    }
}
