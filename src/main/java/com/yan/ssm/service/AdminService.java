package com.yan.ssm.service;

import com.yan.ssm.model.Admin;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/6/20/0020.
 */
public interface AdminService {

    Admin selectByUsername(String username);

    List<Admin> findAllUser();

    int deleteByPrimaryKey(int id);

    int updateByPrimaryKey(Admin admin);

    int insert(Admin admin);

    Admin selectByPrimaryKey(int id);

    List<Admin> selectByParams (Map<String,Object> params);

}
