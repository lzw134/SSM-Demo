package com.system.service;

import com.system.entity.StoreBannerPic;

import java.util.List;

/**
 * @description;
 * @author:李志伟；
 * @date:2022/09/28
 */
public interface BannerService {

    List<StoreBannerPic> QueryAll() throws  Exception;
}
