package com.yan.ssm.service.impl;

import com.yan.ssm.dao.AdminDao;
import com.yan.ssm.model.TblAdmin;
import com.yan.ssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yan on 2017/6/20/0020.
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService{
    private final AdminDao adminDao;

    @Autowired
    public AdminServiceImpl(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    public List<TblAdmin> getAllAdmin() {
        return adminDao.selectAllAdmin();
    }


    public List<TblAdmin> findAllUser() {
        // TODO Auto-generated method stub
        List<TblAdmin> findAllUser = adminDao.findAllUser();
        return findAllUser;
    }

    public int deleteByPrimaryKey(Long id) {
        TblAdmin key = new TblAdmin();
        key.setId(id);
        int rows = adminDao.deleteByPrimaryKey(id);
        return  rows;
    }

    public  int updateByPrimaryKey(TblAdmin admin){
       int rows= adminDao.updateByPrimaryKey(admin);
        return rows;
    }

    public Long insertSelective(TblAdmin admin){
    Long id= adminDao.insertSelective(admin);
      return id;
    }

    public   TblAdmin selectByPrimaryKey(Long id){
        TblAdmin  admin = adminDao.selectByPrimaryKey(id);
        return  admin;
    }

    public   TblAdmin selectByNick(String nick){
        TblAdmin  admin = adminDao.selectByNick(nick);
        return  admin;
    }


}
