package com.cy.service;

import java.util.List;

public interface Service {
    //查询所有
    List selectAll();
    //添加
    Integer insert(Object object);
    //修改
    Integer update(Object object);
    //根据id删除
    Integer deleteById(Integer Id);

}
