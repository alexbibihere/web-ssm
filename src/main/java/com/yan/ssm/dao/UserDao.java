package com.yan.ssm.dao;

import com.yan.ssm.model.TblAdmin;
import com.yan.ssm.model.TblUser;
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

    int updateByPrimaryKey (TblUser user);

    public TblUser getUserById(int userId);

    int deleteById(Long id);
}
