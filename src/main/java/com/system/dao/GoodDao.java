package com.system.dao;

import com.system.entity.StoreGood;

import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */
public interface GoodDao {
    /*查询所有商品信息*/
    List<StoreGood> QueryAllGoods();
}
