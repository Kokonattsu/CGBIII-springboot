package com.cy.pojo;

import java.util.Date;

public class Item {
    private Long id;
    private String name;
    private String remaek;
    private Date createdTime;

    public Item(Long id, String name, String remaek, Date createdTime) {
        this.id = id;
        this.name = name;
        this.remaek = remaek;
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

    public String getRemaek() {
        return remaek;
    }

    public void setRemaek(String remaek) {
        this.remaek = remaek;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
