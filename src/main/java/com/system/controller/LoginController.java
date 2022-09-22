package com.system.controller;

import com.system.common.Result;
import com.system.entity.UserLogin;
import com.system.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserLoginService userloginservice;

    //登录表单处理
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    @ResponseBody
    public Result login(String username) throws Exception {
        UserLogin user = userloginservice.findByName(username);
        return Result.succ(200,"查询成功",user);
    }

    //查询全部
    @RequestMapping(value = "/all" , method = {RequestMethod.GET})
    @ResponseBody
    public List<UserLogin> all() throws Exception {
        List<UserLogin> list = userloginservice.getAllUser();
        return list;
    }
}
