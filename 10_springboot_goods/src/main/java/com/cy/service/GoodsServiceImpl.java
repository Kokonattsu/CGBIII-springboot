package com.cy.service;

import com.cy.dao.GoodsDao;
import com.cy.pojo.Goods;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j//添加日志对象
@Service
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    GoodsDao goodsDao;
    @Override
    public List<Goods> findGoods() {
        Long t1=System.nanoTime();
        List<Goods> goodsList = goodsDao.findGoods();
        long t2=System.nanoTime();
        log.info("findGoods==>"+(t2-t1));
        return goodsList;
    }

    @Override
    public Goods findById(Integer id) {
        return goodsDao.findById(id);
    }


    @Override
    public Integer deleteById(Integer id) {
        return goodsDao.deleteById(id);
    }

    @Override
    public Integer insert(Goods goods) {
        return goodsDao.insert(goods);
    }

    @Override
    public Integer update(Goods goods) {
        return goodsDao.update(goods);
    }

}
