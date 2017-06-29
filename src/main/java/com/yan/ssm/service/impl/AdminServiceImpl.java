package com.yan.ssm.service.impl;

import com.yan.ssm.dao.AdminDao;
import com.yan.ssm.model.Admin;
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


    public List<Admin> findAllUser() {
        // TODO Auto-generated method stub
        List<Admin> findAllUser = adminDao.findAllUser();
        return findAllUser;
    }

    public int deleteByPrimaryKey(int id) {
        int rows = adminDao.deleteByPrimaryKey(id);
        if (rows>0) {
            System.out.println("删除成功:deleteById");
        }
        return  rows;
    }

    public  int updateByPrimaryKey(Admin admin){
       int rows= adminDao.updateByPrimaryKey(admin);
        return rows;
    }

    public Admin checkLogin(String username, String password) {
        Admin admin = adminDao.selectByNick(username);
        if (admin != null && admin.getPassword().equals(password)) {
            System.out.println("用户密码正确：checkLogin");
            return admin;
        }
        return null;
    }

    public List<Admin> selectByParams (Map<String, Object> params){
        List<Admin> adminList =  adminDao.selectByParams(params);
        System.out.println("根据参数查询成功:selectByParams");
        return adminList;
    }

    public int insertSelective(Admin admin){
    int id= adminDao.insertSelective(admin);
      return id;
    }


    public Admin selectByPrimaryKey(int id){
        Admin admin = adminDao.selectByPrimaryKey(id);
        return  admin;
    }

    public Admin selectByNick(String nick){
        Admin admin = adminDao.selectByNick(nick);
        return  admin;
    }


}
