package com.yan.dao.daoImpl;

import com.yan.dao.UDao;
import com.yan.dao.mapper.UserMapper;
import com.yan.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by yan on 2017/6/21/0021.
 */
@Repository("uDao")
public class UDaoImpl implements UDao{

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public User findUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}
