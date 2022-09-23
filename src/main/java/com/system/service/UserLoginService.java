package com.system.service;

import com.system.entity.UserLogin;

import java.util.List;

public interface UserLoginService {

    UserLogin login(UserLogin user) throws Exception;

    int register(UserLogin user) throws  Exception;
}
