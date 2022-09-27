package com.system.service.impl;


import com.system.dao.UserLoginDao;
import com.system.entity.UserLogin;
import com.system.utils.Md5;
import com.system.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.service.UserLoginService;
import com.system.utils.Result;


@Service
public class UserLoginServiceImpl implements UserLoginService{
    @Autowired
    private UserLoginDao userlogindao;

    /*
    *用户登陆
    **/
    @Override
    public Result login(UserLogin user) throws Exception {

        // 1.调用mapper方法 user2:包含了密文密码
        UserLogin userlogin = userlogindao.login(user.getUsername(),Md5.md5(user.getPassword()));

        if(userlogin==null){
            return Result.fail(400,"登录失败",null);
        }else{
            String token = TokenUtil.sign(userlogin.getU_id());
            return Result.succ(200,"登录成功",token);
        }
    }

    /*
    * 用户注册
    * */
    @Override
    public Result register(UserLogin user) throws Exception {
        int result = userlogindao.register(user.getUsername(),Md5.md5(user.getPassword()));
        if(result==1){
            return Result.succ(200,"注册成功",null);
        }else{
            return Result.fail(400,"该账号已存在",null);
        }
    }
}
