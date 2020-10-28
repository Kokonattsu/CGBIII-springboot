package com.cy.pj.module.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ModuleServiceTestS {

    @Autowired
    private ModuleService moduleService;

    @Test
    void testFindPower(){
        System.out.println(moduleService.findPower());
        System.out.println(moduleService.findPower());
        System.out.println(moduleService.findPower());

    }
}
