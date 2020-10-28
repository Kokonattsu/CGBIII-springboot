package com.cy.pj.pool;

import com.cy.pj.common.pool.ObjectPool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ObjectPollTests {
    @Autowired
    private ObjectPool objectPool1;
    @Autowired
    private ObjectPool objectPool2;
    @Test
    void testObjectPool(){
        System.out.println(objectPool1==objectPool2);
    }



}
