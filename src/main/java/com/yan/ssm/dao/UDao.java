package com.yan.ssm.dao;

import com.yan.ssm.model.User;

/**
 * Created by yan on 2017/6/21/0021.
 */
public interface UDao {
    public User findUserByName(String username);
}
