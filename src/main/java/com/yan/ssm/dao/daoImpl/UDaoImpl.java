package com.yan.ssm.dao.daoImpl;

import com.yan.ssm.dao.UDao;
import com.yan.ssm.dao.mapper.UserMapper;
import com.yan.ssm.model.User;
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
