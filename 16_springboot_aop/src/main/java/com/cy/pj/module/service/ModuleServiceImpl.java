package com.cy.pj.module.service;

import com.cy.pj.common.aspect.aspectj.Point;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService{
    @Override
    @Point
    public List<String> findPower() {
        System.out.println("select data from database");
        List<String> list=new ArrayList<>();
        list.add("sys.user.查看");
        list.add("sys.user.修改");
        return list;
    }
}
