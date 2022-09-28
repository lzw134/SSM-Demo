package com.system.controller;

import com.system.entity.UserLogin;
import com.system.service.UserLoginService;
import com.system.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
@Api(tags = "登录注册模块" )//在接口文档的 controller 名字前面显示
public class LoginController {

    @Autowired
    private UserLoginService userloginservice;

    //登录表单处理
    @ApiOperation("登录")//方法上设置，在swagger的每个标签上显示
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    @ResponseBody
    public Result login(UserLogin user) throws Exception {
        return userloginservice.login(user);
    }

    //注册表单处理
    @ApiOperation("注册")//方法上设置，在swagger的每个标签上显示
    @RequestMapping(value = "/register" , method = {RequestMethod.POST})
    @ResponseBody
    public Result register(UserLogin user) throws Exception {
       return  userloginservice.register(user);
    }
}
