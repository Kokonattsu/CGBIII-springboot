package com.cy.pj.module.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.windows.ThemeReader;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public String doHandleArithmeticException(ArithmeticException e){
        e.printStackTrace();
        return "计算出现异常：类型信息为"+e.getMessage();
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String doHandleRuntimeException(RuntimeException e){
        e.printStackTrace();
        return "计算出现异常：类型信息为"+e.getMessage();
    }


    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public String doHandleThrowable(Throwable e){
        e.printStackTrace();
        return "Throwable：类型信息为"+e.getMessage();
    }
}
