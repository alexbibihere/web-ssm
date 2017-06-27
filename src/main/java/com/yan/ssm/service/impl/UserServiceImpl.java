package com.yan.ssm.service.impl;

import com.yan.ssm.dao.UserDao;
import com.yan.ssm.model.TblUser;
import com.yan.ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserDao userDao;

    public TblUser getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }
    
    public TblUser getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    public List<TblUser> getAllUser() {
        List<TblUser> tblUsers =userDao.selectAllUser();
        return tblUsers;
    }


    public String selectByNick() {
        return "sucess";
    }

    public Long insertSelective(TblUser record){
        Object newKey = insertSelective(record);
        return (Long) newKey;
    }

    public int updateByPrimaryKey(TblUser user){
        int id=userDao.updateByPrimaryKey(user);
        return id;
    }

    public  int  deleteById(Long id){
      int rows =  userDao.deleteById(id);
      System.out.println("删除了"+rows);
        return rows;
    }
}
