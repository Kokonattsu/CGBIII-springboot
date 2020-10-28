package com.cy.pj.ajax.controller;

import com.sun.xml.internal.bind.v2.runtime.NameList;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class AjaxController {
    //
    private List<String> namelist=new ArrayList();

    //测试同步和异步请求
    @GetMapping("/doAjaxGet")
    public String daAjaxGet() throws InterruptedException {
        Thread.sleep(2000);
        return "Ajax Get Response Result";
    }

    //检查name是否存在
    @RequestMapping("/doCheck")
    public String doCheck(String name){
        return namelist.contains(name)?name+"不可用":name+"可用";
    }

    //添加name
    @RequestMapping("/doSave")
    public String doSave(String name){
        namelist.add(name);
        return "Save OK!";
    }

    //删除全部name
    @GetMapping("/doDelete")
    public String doDelete(){
        namelist.clear();
        return "delete OK!";
    }

}
