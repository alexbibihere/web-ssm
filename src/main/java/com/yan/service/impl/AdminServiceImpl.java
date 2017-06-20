package com.yan.service.impl;

import com.yan.dao.AdminDao;
import com.yan.model.TblAdmin;
import com.yan.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
}
