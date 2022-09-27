package com.system.service;
import com.system.entity.StoreClass;
import com.system.utils.Result;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */
public interface ClassService {
    /*
    * 查询所有分类信息
    * */
    List<StoreClass> QueryAllClass() throws  Exception;

    /*
    * 上传分类信息
    * */
    Result addList(HttpServletRequest request,MultipartFile file, StoreClass storeClass) throws Exception;

}
