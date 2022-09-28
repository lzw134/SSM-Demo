package com.system.controller;



import com.system.entity.address;
import com.system.service.AddressService;
import com.system.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/address")
@Api(tags = "收货地址管理模块" )//在接口文档的 controller 名字前面显示
public class AddressController {

    @Autowired
    private AddressService addressService;

    @ApiOperation("查询所有收货地址")//方法上设置，在swagger的每个标签上显示
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "token", required = true),
    })
    @ResponseBody
    public Result query(int u_id) throws Exception {
        List<address> list = addressService.QueryAllByU_id(11);
        return Result.succ(200,"查询成功",list);
    }

}
