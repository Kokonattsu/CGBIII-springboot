package com.cy.pj.sys.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysMenu implements Serializable {

    private static final long serialVersionUID = -3390842818791655814L;

    private Integer id;
    private String name;
    private String url;
    private Integer type=1;     //菜单的类型，1普通菜单，2代表按钮菜单
    private Integer sort;
    private String note;        //备注
    private Integer parentId;   //父菜单id
    private String permission;   //菜单对应的权限标识
    private String createdUser; //创建用户
    private String modifiedUser; //上次修改用户
    private Date createdTime;   //创建时间
    private Date modifiedTime;  //修改时间
}
