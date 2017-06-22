package com.yan.ssm.dao.mapper;

import com.yan.ssm.model.User;

/**
 * Created by yan on 2017/6/21/0021.
 */
public interface UserMapper {
    public User getUserByName(String username);
}
