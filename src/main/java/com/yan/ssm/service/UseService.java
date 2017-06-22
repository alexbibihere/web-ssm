package com.yan.ssm.service;

import com.yan.ssm.model.User;

/**
 * Created by yan on 2017/6/21/0021.
 */
public interface UseService {

    public User checkLogin(String username, String password);
}
