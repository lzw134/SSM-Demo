package com.system.service.impl;

import com.system.dao.BannerDao;
import com.system.entity.StoreBannerPic;
import com.system.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/28
 */

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerDao bannerDao;

    @Override
    public List<StoreBannerPic> QueryAll() throws Exception {
        return bannerDao.QueryAll();
    }
}
