package com.cy.pj.goods.pojo;

import java.util.Date;

public class Goods {
    private Long id;//商品id
    private String name;
    private String remark;//备注
    private Date createdTime;//创建时间

    public Goods() {
    }

    public Goods(Long id, String name, String remark, Date createdTime) {
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.createdTime = createdTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
