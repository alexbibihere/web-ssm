package com.yan.ssm.service;

import com.yan.ssm.model.TblAdmin;

import java.util.List;

/**
 * Created by yan on 2017/6/20/0020.
 */
public interface AdminService {

    List<TblAdmin> getAllAdmin();

    List<TblAdmin> findAllUser();

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(TblAdmin admin);

    Long insertSelective(TblAdmin admin);

    TblAdmin selectByPrimaryKey(Long id);
}
