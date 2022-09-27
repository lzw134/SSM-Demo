package com.system.service.impl;


import com.system.dao.AddressDao;
import com.system.entity.address;
import com.system.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    public List<address> QueryAllByU_id(int u_id) throws Exception {

        // 1.调用mapper方法 user2:包含了密文密码
        List<address> list = addressDao.QueryAllByU_id(u_id);
        return list;
    }

}
