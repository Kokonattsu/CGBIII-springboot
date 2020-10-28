package com.cy.pj.common.cache;

import org.springframework.stereotype.Component;

@Component
public class SoftCache implements Cache{
    @Override
    public void print() {
        System.out.println("SoftCache.print()...");
    }
}
