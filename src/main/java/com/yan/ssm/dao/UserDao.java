package com.yan.ssm.dao;

import com.yan.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/6/21/0021.
 */
@Repository
public interface UserDao {

    public User checkLogin(String username, String password);

    public void addUser(User user);

    Long insertSelective(User user);

    int updateSelective(User user);

    int deleteById(int id);

    List<User> selectByParams (Map<String,Object>params);

    User selectByPrimaryKey(int id);

    User selectByNick(@Param("username") String username);
}
