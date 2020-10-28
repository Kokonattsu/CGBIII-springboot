package com.cy.pj.common.cache;

import org.springframework.stereotype.Component;

//@Component  没写名字则首字母小写类名
@Component("wealCache")
public class WealCache implements Cache{//
    @Override
    public void print() {
        System.out.println("WealCache.print()...");
    }
}
