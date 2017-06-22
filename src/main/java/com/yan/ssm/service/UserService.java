package com.yan.ssm.service;

import com.yan.ssm.model.TblUser;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {

    List<TblUser> getAllUser();

    TblUser getUserByPhoneOrEmail(String emailOrPhone, Short state);

    TblUser getUserById(Long userId);

    //TblUser selectByNick(String var1);

    Long insertSelective(TblUser var1);

    String selectByNick() throws  Exception;

    public TblUser getUserById(int userId);
}
