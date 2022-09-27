package com.system.service.impl;

import com.system.dao.ClassDao;
import com.system.entity.StoreClass;
import com.system.service.ClassService;
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
        // 保存图片的路径，图片上传成功后，将路径保存到数据库
        String filePath = "D://upload";

        // 使用UUID生成全新的文件名称
        String newFileName = UUID.randomUUID().toString().replaceAll("-", "");

        //获取文件扩展名
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());

        // 写入文件夹
        //以绝对路径保存重命名后的图片
        file.transferTo(new File(filePath + "/" + newFileName + "." + ext));

        storeClass.setGood_pic(newFileName+"."+ext);

        int result = classdao.AddClass(storeClass);

        if(result == 1){
            return Result.succ(200,"上传成功",null);
        }else{
            return Result.fail(200,"上传失败",null);
        }
    }


}
