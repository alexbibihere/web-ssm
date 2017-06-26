package com.yan.ssm.dao;

import com.yan.ssm.model.TblAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yan on 2017/6/20/0020.
 */
@Repository
public interface AdminDao {
    List<TblAdmin> selectAllAdmin();

    List<TblAdmin> findAllUser();

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(TblAdmin admin);

    Long insertSelective(TblAdmin admin);

    TblAdmin selectByPrimaryKey(Long id);

    TblAdmin selectByNick(String nick);
}
