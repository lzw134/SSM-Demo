package com.system.dao;

import com.system.entity.StoreClass;

import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */
public interface ClassDao {
    /*查询所有分类信息*/
    List<StoreClass> QueryAllClass();
}