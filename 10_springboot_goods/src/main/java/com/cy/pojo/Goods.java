package com.cy.pojo;



import lombok.*;

import java.util.Date;

//@Setter
//@Getter
@NoArgsConstructor//添加无参构造
@AllArgsConstructor//添加所有参数的构造
//@ToString
@Data
public class Goods {
    private Long Id;
    private String Name;
    private String Remark;//备注
    private Date CreatedTime;//创建时间


}
