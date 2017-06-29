package com.yan.ssm.dao;

import com.yan.ssm.model.Admin;
import com.yan.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/6/20/0020.
 */
@Repository
public interface AdminDao {

    List<Admin> findAllUser();

     User checkLogin(String username, String password);

    int deleteByPrimaryKey(int id);

    int updateByPrimaryKey(Admin admin);

    int insertSelective(Admin admin);

    Admin selectByPrimaryKey(int id);

    Admin selectByNick(String nick);

    List<Admin> selectByParams (Map<String,Object> params);
}
