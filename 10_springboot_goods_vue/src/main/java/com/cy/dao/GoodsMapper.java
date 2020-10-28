package com.cy.dao;

import com.cy.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface GoodsMapper {

    //查询所有
    List<Goods> selectAll();

    //添加
    Integer insert(Goods goods);

    //修改
    Integer update(Goods goods);

    //根据id删除
    Integer deleteById(Integer goodId);
}
