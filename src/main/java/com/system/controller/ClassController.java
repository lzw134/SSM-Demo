package com.system.controller;


import com.system.entity.StoreClass;
import com.system.service.ClassService;
import com.system.utils.Result;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation("查询分类图")//方法上设置，在swagger的每个标签上显示
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "token", required = true),
    })
    @ResponseBody
    public Result query() throws Exception {
        List<StoreClass> list = classService.QueryAllClass();
        return Result.succ(200, "查询成功", list);
    }

    @ApiOperation("添加分类")//方法上设置，在swagger的每个标签上显示
    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "token", required = true),
    })
    @ResponseBody
    public Result test(HttpServletRequest request,MultipartFile file, StoreClass storeClass) throws Exception {
        return classService.addList(request,file,storeClass);
    }
}
