package com.yan.ssm.dao;

import com.yan.ssm.model.TblAdmin;
import com.yan.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/6/20/0020.
 */
@Repository
public interface AdminDao {

    List<TblAdmin> findAllUser();

     User checkLogin(String username, String password);

    int deleteByPrimaryKey(int id);

    int updateByPrimaryKey(TblAdmin admin);

    int insertSelective(TblAdmin admin);

    TblAdmin selectByPrimaryKey(int id);

    TblAdmin selectByNick(String nick);

    List<TblAdmin> selectByParams (Map<String,Object> params);
}
