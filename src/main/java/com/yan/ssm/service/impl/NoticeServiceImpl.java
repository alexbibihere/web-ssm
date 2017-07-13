package com.yan.ssm.service.impl;

import com.yan.ssm.dao.NoticeDao;
import com.yan.ssm.model.Notice;
import com.yan.ssm.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by yandeguang on 2017/7/13/0013.
 */
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService{
    @Autowired
    private NoticeDao noticeDao;


    public int deleteByPrimaryKey(Long id) {
        int rows = noticeDao.deleteByPrimaryKey(id);
        if (rows>0) {
            System.out.println("删除成功:deleteById");
        }
        return  rows;
    }

    @Override
    public int insert(Notice record) {
        return 0;
    }

    public  int updateByPrimaryKey(Notice Notice){
        int rows= noticeDao.updateByPrimaryKey(Notice);
        return rows;
    }

    public List<Notice> selectAllNotice(){
        List<Notice> noticeList = noticeDao.selectAllNotice();
        System.out.println("根据参数查询成功:selectAllArticle");
        return  noticeList;
    }

    public List<Notice> selectByParams (Map<String, Object> params){
        List<Notice> NoticeList =  noticeDao.selectByParams(params);
        System.out.println("根据参数查询成功:selectByParams");
        return NoticeList;
    }

    public int insertSelective(Notice Notice){
        int id= noticeDao.insertSelective(Notice);
        System.out.println("添加成功:insertSelective");
        return id;
    }


    public Notice selectByPrimaryKey(Long id){
        Notice notice = noticeDao.selectByPrimaryKey(id);
        return  notice;
    }

    @Override
    public int updateByPrimaryKeySelective(Notice record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Notice record) {
        return 0;
    }


}
