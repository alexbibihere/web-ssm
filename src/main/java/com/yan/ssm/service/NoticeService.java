package com.yan.ssm.service;

import com.yan.ssm.model.Notice;

import java.util.List;
import java.util.Map;

/**
 * Created by yandeguang on 2017/7/13/0013.
 */
public interface NoticeService {
    int deleteByPrimaryKey(Long id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKeyWithBLOBs(Notice record);

    int updateByPrimaryKey(Notice record);

    List<Notice> selectByParams (Map<String,Object> params);

    List<Notice> selectAllNotice ();
}
