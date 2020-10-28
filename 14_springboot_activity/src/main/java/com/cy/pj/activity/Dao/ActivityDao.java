package com.cy.pj.activity.Dao;

import com.cy.pj.activity.pojo.Activity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ActivityDao {
    //查询全部活动
    @Select("select * from tb_activity order by createdTime desc")
    List<Activity> findActivitys();

    //添加活动
    Integer insertActivity(Activity activity);

    //删除活动
    @Delete("delete from tb_activity where id=#{id}")
    Integer deleteById(Integer id);

    //使活动失效
    @Update("update tb_activity set state=0 where id=#{id}")
    Integer updateState(Integer id);

    //修改活动
    Integer updateActivity(Activity activity);
}
