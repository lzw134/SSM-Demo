package com.system.service;

import com.system.entity.UserLogin;

import java.util.List;

public interface UserLoginService {
    //根据名字查找用户
    UserLogin findByName(String name) throws Exception;

    //查询全部
    List<UserLogin> getAllUser() throws Exception;
}
