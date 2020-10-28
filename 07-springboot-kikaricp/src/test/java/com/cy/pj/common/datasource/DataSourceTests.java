package com.cy.pj.common.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
/**
 *  FAQ?
 *  1)DataSource 由谁定义?
 *  2)DataSource 定义了什么?
 *  3)我们为什么要耦合于DataSource?
 *  4)程序运行时这个变量指向的对象类型是谁?你怎么知道的?
 */

@SpringBootTest
public class DataSourceTests {
    //耦合于DataSource接口
    @Autowired
    private DataSource dataSource;

    @Test
    public void testConnection() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
