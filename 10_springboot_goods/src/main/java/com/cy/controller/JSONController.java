package com.cy.controller;

import com.cy.dao.GoodsMapper;
import com.cy.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JSONController {
    @Autowired
    private GoodsMapper goodsMapper;
    //查看全部
    @RequestMapping("/selectAll")
    public List<Goods> selectAll(){
        return goodsMapper.selectAll();
    }

    //
    @RequestMapping("/insert/{Name}/{Remark}")
    public Integer insert(@PathVariable String Name,@PathVariable String Remark){
        Goods goods=new Goods();
        goods.setName(Name);
        goods.setRemark(Remark);
        return goodsMapper.insert(goods);
    }

    @RequestMapping("/delete/{goodsId}")
    public Integer deleteById(@PathVariable Integer goodsId){
        return goodsMapper.deleteById(goodsId);
    }

    @RequestMapping("/update/{Id}/{Name}/{Remark}")
    public Integer update(@PathVariable Long Id,
                          @PathVariable String Name,
                          @PathVariable String Remark ){
        Goods goods=new Goods();
        goods.setId(Id);
        goods.setName(Name);
        goods.setRemark(Remark);
        return goodsMapper.update(goods);
    }
}
