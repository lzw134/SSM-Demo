package com.system.controller;

import com.system.utils.Result;
import com.system.entity.UserLogin;
import com.system.service.UserLoginService;
import com.system.utils.TokenUtil;
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
    public Result login(UserLogin user) throws Exception {
        UserLogin user2 = userloginservice.login(user);
        if(user2==null){
            return Result.fail(400,"登录失败",null);
        }else{
            String token = TokenUtil.sign(user2.getU_id());
            return Result.succ(200,"登录成功",token);
        }
    }

    //注册表单处理
    @RequestMapping(value = "/register" , method = {RequestMethod.POST})
    @ResponseBody
    public Result register(UserLogin user) throws Exception {
       int result = userloginservice.register(user);
       if(result==-1){
           return Result.fail(400,"该账号已存在",null);
       }else{
           return Result.succ(200,"注册成功",null);
       }
    }
}
