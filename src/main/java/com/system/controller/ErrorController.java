package com.system.controller;


import com.system.entity.UserLogin;
import com.system.utils.Result;
import com.system.utils.TokenUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
    public Result error() throws Exception {
            return Result.fail("token验证失败",null);
    }
}
