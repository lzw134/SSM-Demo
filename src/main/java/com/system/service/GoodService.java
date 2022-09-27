package com.system.service;

import com.system.entity.StoreGood;

import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */
public interface GoodService {
    /*
     * 查询所有分类信息
     * */
    List<StoreGood> QueryAllGoods() throws  Exception;
}
