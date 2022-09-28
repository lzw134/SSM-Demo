package com.system.controller;

import com.system.entity.StoreBannerPic;
import com.system.service.BannerService;
import com.system.utils.Result;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/28
 */

@Controller
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @ApiOperation("查询banner图")//方法上设置，在swagger的每个标签上显示
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "token", required = true),
    })
    @ResponseBody
    public Result query() throws Exception {
        List<StoreBannerPic> list = bannerService.QueryAll();
        return Result.succ(200,"查询成功",list);
    }
}
