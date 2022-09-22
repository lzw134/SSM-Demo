package com.system.dao;

import com.system.entity.UserLogin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLoginDao {
    /*
     * 根据用户名查询信息
     * */
    UserLogin getUserByUserName(@Param("username") String username);

    /*
    * 查询全部
    * */
    List<UserLogin> getAllUser();
}
