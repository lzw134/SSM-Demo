package com.system.service;

import com.system.entity.UserLogin;
import com.system.utils.Result;


public interface UserLoginService {

    Result login(UserLogin user) throws Exception;

    Result register(UserLogin user) throws  Exception;
}
