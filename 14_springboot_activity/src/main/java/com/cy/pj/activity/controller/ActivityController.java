package com.cy.pj.activity.controller;

import com.cy.pj.activity.pojo.Activity;
import com.cy.pj.activity.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    //获取页面
    @GetMapping("/")
    public String doActivityUI(){
        return "activity";
    }

    //查看全部活动
    @ResponseBody
    @GetMapping("/activity/doFindActivitys")
    public List<Activity> doFindActivity(){
        List<Activity> list = activityService.findActivitys();
        return list;
    }

    //添加活动
    @ResponseBody
    @PostMapping("/activity/doSaveActivity")
    public String doSaveActivity(Activity activity){
        activityService.saveActivity(activity);
        return activity.getTitle()+"添加成功";
    }

    //使活动失效
    @ResponseBody
    @GetMapping("/activity/updateState/{id}")
    public String updateState(@PathVariable Integer id){
        activityService.updateState(id);
        return "活动结束";
    }

    //修改活动
    @ResponseBody
    @PostMapping("/activity/doUpdateActivity")
    public String doUpdateActivity(Activity activity){
        activityService.updateActivity(activity);
        return activity.getTitle()+"修改成功";
    }

    //删除活动
    @ResponseBody
    @GetMapping("/activity/doDeleteById/{id}")
    public String doDeleteById(@PathVariable Integer id){
        activityService.deleteByid(id);
        return "删除成功";
    }
}
