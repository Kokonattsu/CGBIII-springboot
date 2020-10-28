package com.cy.pj.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ModuleController {
    @ResponseBody
    @RequestMapping("/doCompute/{i1}/{i2}")
    public String doCompute(@PathVariable Integer i1,@PathVariable Integer i2){
       // try {
            Integer result=i1/i2;
           return "result="+result;
       // }catch ( ArithmeticException e){
       //     return "除数不能为零";
        // }

    }
    //描述异常的方法//
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public String doHandleArithmeticException(ArithmeticException e){
        e.printStackTrace();
        return "计算出现异常：类型信息为"+e.getMessage();
    }
}
