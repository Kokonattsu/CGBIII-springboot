package com.cy.controller;

import com.cy.dao.GoodsMapper;
import com.cy.pojo.Goods;
import com.cy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/goods/")
public class GoodsController {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsService goodsService;
    //查询页面
    @RequestMapping("/doGoodsUI")
    public String doGoodsUI(Model model){
        List<Goods> goodsList = goodsService.findGoods();
        model.addAttribute("goodsList",goodsList);
        return "goods";
    }

    //根据id查询商品
    @GetMapping("/doFindById/{id}")
    public String doFindById(@PathVariable Integer id,Model model){
        Goods goods = goodsService.findById(id);
        model.addAttribute("goods",goods );
        return "goods-update";
    }

    //根据id删除并重定向到查询
   @RequestMapping("/doDeleteById/{id}")
   public String doDeleteById(@PathVariable Integer id){
        goodsService.deleteById(id);
        return "redirect:/goods/doGoodsUI";//返回值重定向到查询页面
   }

   //跳转添加商品
   @RequestMapping("/doGoodsAddUI")
   public String doGoodsAddUI(){
        return "goods-add";
   }

   //添加商品
    @RequestMapping("/doAddGoods")
    public String doAddGoods(Goods goods){
        goodsService.insert(goods);
        return "redirect:/goods/doGoodsUI";
    }

    //修改商品
    @PostMapping("/doGoodsUpdateUI")
    public String doGoodsUpdateUI(Goods goods){
        goodsService.update(goods);
        return "redirect:/goods/doGoodsUI";
    }


    //

    @RequestMapping("/selectAll1")
    public String selectAll(Model model){
        List<Goods> list = goodsMapper.selectAll();
        model.addAttribute("list", list);
        return "index";
    }

    @RequestMapping("/insert1")
    public Integer insert(Goods goods){
        return 1;
    }

    @RequestMapping("/delete1/{goodsId}")
    public String deleteById(@PathVariable Integer goodsId){
        Integer integer = goodsMapper.deleteById(goodsId);
        return "index";
    }

}
