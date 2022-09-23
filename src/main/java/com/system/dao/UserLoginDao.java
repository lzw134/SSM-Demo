package com.system.dao;

import com.system.entity.UserLogin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLoginDao {
    /*
     * 用户登录
     * */
    UserLogin login(@Param("username") String username, @Param("password") String password);

    /*
     * 用户注册
     * */
    int register(@Param("username") String username, @Param("password") String password);

}
