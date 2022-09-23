package com.system.service;

import com.system.entity.address;

import java.util.List;

public interface AddressService {

    List<address> QueryAllByU_id(int u_id) throws  Exception;
}
