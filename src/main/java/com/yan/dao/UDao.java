package com.yan.dao;

import com.yan.model.User;

/**
 * Created by yan on 2017/6/21/0021.
 */
public interface UDao {
    public User findUserByName(String username);
}
