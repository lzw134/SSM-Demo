package com.system.service.impl;


import com.system.dao.UserLoginDao;
import com.system.entity.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.service.UserLoginService;

import java.util.List;


@Service
public class UserLoginServiceImpl implements UserLoginService{
    @Autowired
    private UserLoginDao userlogindao;

    public UserLogin findByName(String username) throws Exception {
        UserLogin userlogin = userlogindao.getUserByUserName(username);
        return userlogin;
    }

    public List<UserLogin> getAllUser() throws Exception {
        List<UserLogin> list = userlogindao.getAllUser();
        return list;
    }
}
