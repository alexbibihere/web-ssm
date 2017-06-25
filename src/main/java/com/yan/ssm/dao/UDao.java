package com.yan.ssm.dao;

import com.yan.ssm.model.TblUser;
import com.yan.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by yan on 2017/6/21/0021.
 */
@Repository
public interface UDao {
    public User findUserByName(String username);

    public void addUser(User user);

    Long insertSelective(User user);
}
