package com.cy.pj.ajax.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class JQueryAjaxController {

    private Map<String,Object> map=new HashMap<>();

    //含参的get请求，转换成大写输出，用于测试ajax请求
    @GetMapping("/doAjax")
    public String doAjax(String msg){
        return msg+"toUpperCase()="+msg.toUpperCase();
    }

    //get请求
    @GetMapping("/doGet")
    public Map<String,Object> doGet(){
        map.put("code", 1);
        map.put("message", "success");
        map.put("data","hello");
        return map;
    }


    //Post请求
    @PostMapping("/doPost")
    public String doPost(@RequestParam Map<String,Object> map){
       //this.map.put()
        System.out.println(map);
        return "post OK";
    }

    //以json对象形式入参的post请求
    @PostMapping("/doPostJSON")
    public String doPostJSON(@RequestBody Map<String,Object> map){
        System.out.println(map);
        return "post okk";
    }
}
