package com.cy.pj.common.pool;
//测试@Lazy注解
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Lazy//描述类的对象可以延迟记载，
@Component
public class ObjectPool {

    public ObjectPool(){
        System.out.println("ObjectPool()");
    }

    @PostConstruct//该类在初始化时执行该方法
    public void init(){
        System.out.println("init()...");
    }

    public void delete(){
        System.out.println("delete()...");
    }

    @Override
    public void finalize(){
        System.out.println("finalize()....");
    }



}
