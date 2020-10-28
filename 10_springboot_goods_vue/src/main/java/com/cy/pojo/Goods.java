package com.cy.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

//@Setter
//@Getter
@NoArgsConstructor//添加无参构造
@AllArgsConstructor//添加所有参数的构造
//@ToString
@Data
public class Goods {
    private Long id;
    private String name;
    private String remark;//备注

    //以给定格式的JSON格式输出
    @JsonFormat(pattern ="yyyy/MM/dd HH:mm:ss")
    private Date createdTime;//创建时间


}
