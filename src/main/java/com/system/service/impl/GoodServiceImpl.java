package com.system.service.impl;


import com.system.dao.GoodDao;
import com.system.entity.StoreGood;
import com.system.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/27
 */
@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodDao gooddao;

    @Override
    public List<StoreGood> QueryAllGoods() throws Exception {
        List<StoreGood> list = gooddao.QueryAllGoods();
        return list;
    }
}
