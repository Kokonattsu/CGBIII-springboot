package com.cy.pj.health.controller;

import com.cy.pj.health.pojo.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @RequestMapping("/doHander")
    public ResponseResult doHanderRequest(){
        ResponseResult result=new ResponseResult();
        result.setCode(100);
        //转化成json时会调用get方法，以get方法名“get”后面的值为key，以返回值为value
        //请求url携带的参数的名要跟接收参数的对象的set方法“set”后的值一样
        //形参中加@RequestParam注解 可以用Map接收参数
        result.setMessage("OK");
        return result;
    }

    @GetMapping("/getTest")//只能用get请求访问
    public String getTest(){
        return "getRequest().....";
    }

    @PostMapping("/postTest")//只能用post请求访问，用get报405
    public String postTest(){
        return "PostRequest()....";
    }

}
