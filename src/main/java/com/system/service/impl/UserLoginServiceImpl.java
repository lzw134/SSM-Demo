package com.system.service.impl;


import com.system.dao.UserLoginDao;
import com.system.entity.UserLogin;
import com.system.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.service.UserLoginService;

import java.util.List;


@Service
public class UserLoginServiceImpl implements UserLoginService{
    @Autowired
    private UserLoginDao userlogindao;

    /*
    *用户登陆
    **/
    @Override
    public UserLogin login(UserLogin user) throws Exception {

        // 1.调用mapper方法 user2:包含了密文密码
        UserLogin userlogin = userlogindao.login(user.getUsername(),Md5.md5(user.getPassword()));

        return userlogin;
    }

    /*
    * 用户注册
    * */
    @Override
    public int register(UserLogin user) throws Exception {
        UserLogin userLogin = userlogindao.login(user.getUsername(),Md5.md5(user.getPassword()));
        if(userLogin==null){
            int result = userlogindao.register(user.getUsername(),Md5.md5(user.getPassword()));
            return result;
        }else{
            /*返回-1代表该用户已经注册过*/
            return  -1;
        }
    }
}
