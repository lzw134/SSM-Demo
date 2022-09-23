package com.system.dao;

import com.system.entity.address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressDao {
    /*根据u_id查询地址*/
    List<address> QueryAllByU_id(@Param("u_id") int u_id);
}
