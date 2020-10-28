package com.cy.controller;

import com.cy.dao.GoodsDao;
import com.cy.pojo.Goods;
import com.cy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**查询所有商品信息*/
    @GetMapping("/goods/doFindGoods")
    public List<Goods> doFindGoods(){
        return  goodsService.findGoods();
    }

    @GetMapping("goods/doDeleteById/{id}")
    public String doDeleteById(@PathVariable Integer id){
        Integer integer = goodsService.deleteById(id);
        return "删除了"+integer+"条数据";
    }
    //添加
    @PostMapping("/goods/doSaveGoods")
    public String doSaveGoods(@RequestBody Goods entity){
        Integer insert = goodsService.insert(entity);
        return "添加了"+insert+"条数据：";
    }

    //根据id查询
    @GetMapping("/goods/doFindById/{id}")
    public Goods doFindById(@PathVariable Integer id){
        return goodsService.findById(id);
    }

    //修改
    @PostMapping("/goods/doUpdateGoods")
    public String doUpdateGoods(@RequestBody Goods goods){
        Integer update = goodsService.update(goods);
        return "更新了"+update+"条数据：";
    }
}
