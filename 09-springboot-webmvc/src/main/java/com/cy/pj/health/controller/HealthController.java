package com.cy.pj.health.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HealthController {
    //Handler 处理分发器传递的请求

    @RequestMapping("/doHealth")
    public ModelAndView doHealth(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("default");//viewName
        mv.addObject("username", "aaaaaaa");
        mv.addObject("state", "1111111");
        //return "default";//返回一个页面
        return mv;
        //ModelAndView类型返回值由DispatcherServlet
        //调用viewResolver进行处理，
        //viewResolver根据viewName找到页面，
        //将mv中的数据填充到view页面上
        //处理完毕后返回给DispatcherServlet
    }

    @RequestMapping("/doHealth1")
    public String doHealth(Model model){        //返回数据（model）和（页面）view
        model.addAttribute("username", "aaaaaaa");
        model.addAttribute("state", "1111111");

        return "default";
    }

    @RequestMapping("/doPrint")
    @ResponseBody
    public void doPrint(HttpServletResponse response) throws Exception {
        Map<String,Object> map=new HashMap<>();
        map.put("username", "雷神");
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        map.put("e", "5");
        map.put("f", "6");
        map.put("g", "7");

        ObjectMapper objectMapper=new ObjectMapper();
        String json=objectMapper.writeValueAsString(map);

        System.out.println("----------"+json+"-------------");
        //设置响应输出的字符集
        response.setCharacterEncoding("utf-8");
        //设置响应类型和字符集（通知客户端以这个类型展示）
        response.setContentType("text/html;charset=utf-8");
        //通过response对象将json字符串以字符流写出到客户端
        response.getWriter().println(json);

    }

}
