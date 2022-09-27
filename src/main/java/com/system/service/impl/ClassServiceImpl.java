package com.system.service.impl;

import com.system.dao.ClassDao;
import com.system.entity.StoreClass;
import com.system.service.ClassService;
import com.system.utils.FileUtil;
import com.system.utils.Result;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassDao classdao;

    @Override
    public List<StoreClass> QueryAllClass() throws Exception {
        List<StoreClass> list = classdao.QueryAllClass();
        return list;
    }

    @Override
    public Result addList(HttpServletRequest request, MultipartFile file, StoreClass storeClass) throws Exception {

        /*调用文件处理类*/
        String newFileName = FileUtil.fileUtils(file);

        storeClass.setGood_pic(newFileName);

        int result = classdao.AddClass(storeClass);

        if(result == 1){
            return Result.succ(200,"上传成功",null);
        }else{
            return Result.fail(200,"上传失败",null);
        }
    }


}
