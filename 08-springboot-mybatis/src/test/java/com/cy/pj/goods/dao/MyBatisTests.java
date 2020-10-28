package com.cy.pj.goods.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;

@SpringBootTest
public class MyBatisTests {
    //SqlSession为mybatis框架中实现与数据库进行会话的接口
    @Autowired
    private SqlSession sqlSession;

    @Test
    public void testGetConnnection(){
        Connection conn=sqlSession.getConnection();
        System.out.println(conn);
        //断言测试：测试该对象是否为空
        Assertions.assertNotNull(conn);
    }
}
