package com.cy.pj.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Driver;
import java.sql.DriverManager;

@SpringBootTest//表示此类交给springboot管理，扫描反射注入时才能找到这个类
public class DefaultCacheTests {


    @Autowired //描述的属性有spring框架按照一定规则为其注入值
    private DefaultCache defaultCache;

    @Autowired
    private DefaultCache defaultCache1;

    //DriverManager

    @Test
    void testDefaultCache(){
        System.out.println(defaultCache);
        System.out.println(defaultCache1);
    }
}
