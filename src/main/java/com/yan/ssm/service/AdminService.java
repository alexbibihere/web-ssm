package com.yan.ssm.service;

import com.yan.ssm.model.TblAdmin;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/6/20/0020.
 */
public interface AdminService {

    TblAdmin checkLogin(String username, String password);

    List<TblAdmin> findAllUser();

    int deleteByPrimaryKey(int id);

    int updateByPrimaryKey(TblAdmin admin);

    int insertSelective(TblAdmin admin);

    TblAdmin selectByPrimaryKey(int id);

    List<TblAdmin> selectByParams (Map<String,Object> params);

    TblAdmin selectByNick(String nick);
}
