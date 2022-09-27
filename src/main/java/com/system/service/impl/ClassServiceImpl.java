package com.system.service.impl;

import com.system.dao.ClassDao;
import com.system.entity.StoreClass;
import com.system.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        System.out.println("1111"+list);
        return list;
    }
}
