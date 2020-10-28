package com.cy.pj.common.Cache;

import com.cy.pj.common.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class CacheTests {//此类和Cache类时has a的关系

    @Qualifier("softCache")//只能配合@Autowired使用
    @Autowired
    Cache cache;

    @Autowired
    Cache wealCache;

   


}
