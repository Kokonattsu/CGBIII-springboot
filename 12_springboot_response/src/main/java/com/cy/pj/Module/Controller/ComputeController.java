package com.cy.pj.Module.Controller;

import com.cy.pj.common.pojo.ResponseResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {

    @RequestMapping("/doCompute/{n1}/{n2}")
    public Object doCompute(@PathVariable Integer n1,
                            @PathVariable Integer n2){
        Integer result=n1/n2;
        ResponseResult response=new ResponseResult();
        response.setData("计算结果："+result);
        return response;
    }
}
