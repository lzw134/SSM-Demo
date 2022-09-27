package com.system.controller;

import com.system.entity.UserLogin;
import com.system.service.UserLoginService;
import com.system.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserLoginService userloginservice;

    //登录表单处理
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    @ResponseBody
    public Result login(UserLogin user) throws Exception {
        return userloginservice.login(user);
    }

    //注册表单处理
    @RequestMapping(value = "/register" , method = {RequestMethod.POST})
    @ResponseBody
    public Result register(UserLogin user) throws Exception {
       return  userloginservice.register(user);
    }
}
