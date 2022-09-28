package com.system.controller;


import com.system.entity.StoreClass;
import com.system.service.ClassService;
import com.system.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */

@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ResponseBody
    public Result query() throws Exception {
        List<StoreClass> list = classService.QueryAllClass();
        return Result.succ(200, "查询成功", list);
    }


    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    @ResponseBody
    public Result test(HttpServletRequest request,MultipartFile file, StoreClass storeClass) throws Exception {
        return classService.addList(request,file,storeClass);
    }
}
