package com.yan.dao.mapper;

import com.yan.model.User;

/**
 * Created by yan on 2017/6/21/0021.
 */
public interface UserMapper {
    public User getUserByName(String username);
}
