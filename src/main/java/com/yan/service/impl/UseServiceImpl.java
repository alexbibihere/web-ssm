package com.yan.service.impl;

import com.yan.dao.UDao;
import com.yan.model.User;
import com.yan.service.UseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yan on 2017/6/21/0021.
 */
@Service("useService")
public class UseServiceImpl implements UseService{
    @Resource
    private UDao uDao;

    public User checkLogin(String username, String password) {
        User user = uDao.findUserByName(username);
        if (user !=null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

}
