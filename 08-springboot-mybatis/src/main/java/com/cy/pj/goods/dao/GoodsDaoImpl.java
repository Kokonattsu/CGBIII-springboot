package com.cy.pj.goods.dao;

import com.cy.pj.goods.pojo.Goods;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * 自定义接口实现类，
 */
@Repository //dao层实现类注解
public class GoodsDaoImpl implements GoodsDao
{
    //创建SqlSession的工厂对象
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    public GoodsDaoImpl() {
        System.out.println("GoodsDaoImpl");
    }

    @Override
    public List<Goods> findGoods() {
        System.out.println("----GoodsDaoImpl-----");
        //获取SqlSession对象，
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //namespace和方法名
        String Statement="com.cy.pj.goods.dao.GoodsDao.findGoods";
        //
        List<Goods> list = sqlSession.selectList(Statement);

        return list;
    }
}
