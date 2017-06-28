package com.yan.ssm.service;

import com.yan.ssm.model.TblUser;
import com.yan.ssm.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {

    List<TblUser> getAllUser();

    TblUser getUserByPhoneOrEmail(String emailOrPhone, Short state);

     TblUser checkLogin(String username, String password);

    TblUser getUserById(Long userId);

    Long insertSelective(TblUser var1);

    String selectByNick() throws  Exception;

    int updateByPrimaryKey (TblUser user);

    int deleteById(Long id);

    List<TblUser> selectByParams (Map<String,Object> params);
}
