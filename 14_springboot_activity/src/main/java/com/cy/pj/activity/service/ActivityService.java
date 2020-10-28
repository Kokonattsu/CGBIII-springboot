package com.cy.pj.activity.service;

import com.cy.pj.activity.pojo.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> findActivitys();

    Integer saveActivity(Activity activity);

    Integer deleteByid(Integer id);

    Integer updateState(Integer id);

    Integer updateActivity(Activity activity);
}
