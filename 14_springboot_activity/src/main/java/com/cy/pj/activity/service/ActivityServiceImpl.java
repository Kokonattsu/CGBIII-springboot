package com.cy.pj.activity.service;

import com.cy.pj.activity.Dao.ActivityDao;
import com.cy.pj.activity.pojo.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityServiceImpl implements ActivityService{

    @Autowired
    private ActivityDao activityDao;

    //查询全部
    @Override
    public List<Activity> findActivitys() {
        return activityDao.findActivitys();
    }

    //增加活动
    @Override
    public Integer saveActivity(Activity activity) {
        return activityDao.insertActivity(activity);
    }

    //根据id删除
    @Override
    public Integer deleteByid(Integer id) {
        return activityDao.deleteById(id);
    }

    //使活动失效
    @Override
    public Integer updateState(Integer id) {
        return activityDao.updateState(id);
    }

    //修改活动
    @Override
    public Integer updateActivity(Activity activity) {
        return activityDao.updateActivity(activity);
    }

}
