package com.cy.pj.activity.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Activity {
    private Integer id;         //活动编号（主键）
    private String title;       //活动标题
    private String category;    //商品名
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date startTime;     //活动起始时间
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date endTime;       //活动结束时间
    private String remark;      //活动描述
    private Integer state;      //活动状态
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm")
    private Date createdTime;   //活动创建时间
    private String createdUser; //活动创建者（策划）
}
