package com.yan.ssm.dao;

import com.yan.ssm.model.TblAdmin;
import com.yan.ssm.model.TblUser;
import com.yan.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Repository
public interface UserDao {

    TblUser selectUserById(@Param("userId") Long userId);

    TblUser selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<TblUser> selectAllUser();

    TblUser selectByNick(@Param("username") String username);

    List<TblUser> selectByParams (Map<String,Object> params);

    int updateByPrimaryKey (TblUser user);


    int deleteById(Long id);
}
