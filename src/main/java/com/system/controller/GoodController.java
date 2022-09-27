package com.system.controller;

import com.system.entity.StoreGood;
import com.system.service.GoodService;
import com.system.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */

@Controller
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ResponseBody
    public Result query() throws Exception {
        List<StoreGood> list = goodService.QueryAllGoods();
        return Result.succ(200,"查询成功",list);
    }
}
