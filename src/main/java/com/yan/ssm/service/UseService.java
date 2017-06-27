package com.yan.ssm.service;

import com.yan.ssm.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/6/21/0021.
 */
public interface UseService {

    public User checkLogin(String username, String password);


    //添加用户
    public boolean addUser(Map<String,Object> map);

    void insertSelective(User user);

    int updateSelective(User user);

    int deleteById(int id);

    List<User> selectByParams (Map<String,Object>params);


    User selectByPrimaryKey(int id);

    User selectByNick(String username) ;
}
