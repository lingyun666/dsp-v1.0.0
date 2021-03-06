package com.cetiti.dsp.web;

import com.cetiti.core.annotation.LogInject;
import com.cetiti.core.controller.ControllerSupport;
import com.cetiti.core.model.PageModel;
import com.cetiti.dsp.entity.Goods;
import com.cetiti.dsp.service.GoodsService;
import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/goods")
public class GoodsController extends ControllerSupport{

    @LogInject
    private Logger log;

    @Autowired
    private GoodsService goodsService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public PageModel<Goods> list(){
        this.offsetPage(0, 10);
        List<Goods> list = goodsService.getGoodsListByHm();
        return this.resultPage(list);
    }

    @RequestMapping(value = "/{goodsId}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public void reduceGoods(Goods goods){
        int result = goodsService.reduceGoods(goods.getGoodsId());
    }
}
