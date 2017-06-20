package com.yan.dao;

import com.yan.model.TblUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Repository
public interface UserDao {

    TblUser selectUserById(@Param("userId") Long userId);

    TblUser selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<TblUser> selectAllUser();

    TblUser selectByNick(@Param("username") String username);

    Long insertSelective(TblUser var1);

    public TblUser getUserById(int userId);
}
