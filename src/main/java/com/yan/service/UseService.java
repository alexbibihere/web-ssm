package com.yan.service;

import com.yan.model.User;

/**
 * Created by yan on 2017/6/21/0021.
 */
public interface UseService {

    public User checkLogin(String username, String password);
}
