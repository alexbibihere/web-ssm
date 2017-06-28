package com.yan.ssm.service.impl;

import com.yan.ssm.dao.AdminDao;
import com.yan.ssm.model.TblAdmin;
import com.yan.ssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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


    public List<TblAdmin> findAllUser() {
        // TODO Auto-generated method stub
        List<TblAdmin> findAllUser = adminDao.findAllUser();
        return findAllUser;
    }

    public int deleteByPrimaryKey(int id) {
        int rows = adminDao.deleteByPrimaryKey(id);
        if (rows>0) {
            System.out.println("删除成功:deleteById");
        }
        return  rows;
    }

    public  int updateByPrimaryKey(TblAdmin admin){
       int rows= adminDao.updateByPrimaryKey(admin);
        return rows;
    }

    public TblAdmin checkLogin(String username, String password) {
        TblAdmin admin = adminDao.selectByNick(username);
        if (admin != null && admin.getPassword().equals(password)) {
            System.out.println("用户密码正确：checkLogin");
            return admin;
        }
        return null;
    }

    public List<TblAdmin> selectByParams (Map<String, Object> params){
        List<TblAdmin> adminList =  adminDao.selectByParams(params);
        System.out.println("根据参数查询成功:selectByParams");
        return adminList;
    }

    public int insertSelective(TblAdmin admin){
    int id= adminDao.insertSelective(admin);
      return id;
    }


    public   TblAdmin selectByPrimaryKey(int id){
        TblAdmin  admin = adminDao.selectByPrimaryKey(id);
        return  admin;
    }

    public   TblAdmin selectByNick(String nick){
        TblAdmin  admin = adminDao.selectByNick(nick);
        return  admin;
    }


}
