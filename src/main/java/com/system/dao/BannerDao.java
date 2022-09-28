package com.system.dao;

import com.system.entity.StoreBannerPic;


import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/28
 */


public interface BannerDao {
    /*根据u_id查询地址*/
    List<StoreBannerPic> QueryAll();
}
