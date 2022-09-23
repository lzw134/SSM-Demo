package com.system.controller;


import com.system.entity.UserLogin;
import com.system.entity.address;
import com.system.service.AddressService;
import com.system.utils.Result;
import com.system.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;


    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    @ResponseBody
    public Result query(int u_id) throws Exception {
        List<address> list = addressService.QueryAllByU_id(11);
        return Result.succ(200,"查询成功",list);
    }

}
