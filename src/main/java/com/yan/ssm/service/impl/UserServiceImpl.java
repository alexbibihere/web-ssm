package com.yan.ssm.service.impl;

import com.yan.ssm.dao.UserDao;
import com.yan.ssm.model.TblUser;
import com.yan.ssm.model.User;
import com.yan.ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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

    public TblUser checkLogin(String username, String password) {
        TblUser tblUser = userDao.selectByNick(username);
        if (tblUser != null && tblUser.getUserPwd().equals(password)) {
            return tblUser;
        }
        return null;
    }

    public String selectByNick() {
        return "sucess";
    }

    public List<TblUser> selectByParams (Map<String, Object> params){
        List<TblUser> userList =  userDao.selectByParams(params);
        System.out.println("根据参数查询成功");
        return userList;
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
