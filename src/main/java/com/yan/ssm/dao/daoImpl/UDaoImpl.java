/*
package com.yan.ssm.dao.daoImpl;

import com.yan.ssm.dao.UDao;
import com.yan.ssm.dao.mapper.UserMapper;
import com.yan.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

*/
/**
 * Created by yan on 2017/6/21/0021.
 *//*

@Repository("uDao")
public class UDaoImpl implements UDao{

    @Resource(name = "userMapper")
    private UserMapper userMapper;
    @Resource(name = "userMapper")
    private UDaoImpl uDao;

    public User findUserByName(String username) {
        return userMapper.getUserByName(username);
    }


    public void addUser(User user) {
        userMapper.addUser(user);
         return;
    }

    public Long insertSelective(@Param("username") String username, @Param("password") String password) {
        Long id =  u.insertSelective(username, password);
        return id;
    }
}
*/
