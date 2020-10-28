package com.cy.dao;

import com.cy.pojo.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsDao {

    @Select("select * from tb_goods")
    public List<Goods> findGoods();

    @Select("select * from tb_goods where id=#{id}")
    public Goods findById(Integer id);

    @Delete("delete from tb_goods where id=#{id}")
    public Integer deleteById(Integer id);

    @Insert("insert into tb_goods(name,remark,createdTime) value(#{name},#{remark},now()) ")
    public Integer insert(Goods entity);//entity实体

    @Update("update tb_goods set name=#{Name},remark=#{Remark} WHERE id=#{Id};")
    public Integer update(Goods entity);
}
