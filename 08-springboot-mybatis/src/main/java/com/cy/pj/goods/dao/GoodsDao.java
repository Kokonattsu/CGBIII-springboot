package com.cy.pj.goods.dao;

import com.cy.pj.goods.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
 //mybatis定义，用于标记持久层接口，
// mybatis会自动为其创建实现类
//@Mapper
public interface GoodsDao {
    List<Goods> findGoods();
}
//商品模块持久层对象，
