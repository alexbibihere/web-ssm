package com.yan.ssm.service.impl;

import com.yan.ssm.dao.UDao;
import com.yan.ssm.model.TblUser;
import com.yan.ssm.model.User;
import com.yan.ssm.service.UseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/6/21/0021.
 */
@Service("useService")
public class UseServiceImpl implements UseService {
    @Resource
    private UDao uDao;

    public User checkLogin(String username, String password) {
        User user = uDao.findUserByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }


    @Override
    public boolean addUser(Map<String, Object> map) {
        boolean reslut;
        User user = new User();
        String username = (String) map.get("username");
        User finduser = uDao.findUserByName(username);
        if (finduser == null) {
            user.setUsername(username);
            user.setPassword((String) map.get("password"));
            uDao.addUser(user);
            System.out.println("添加成功");
            reslut = true;
        } else {
            reslut = false;
        }
        return reslut;
    }

    public void insertSelective(User user) {
        uDao.insertSelective(user);
        System.out.println("注册成功");
    }

    public Long insertSelective(TblUser record) {
        Object newKey = insertSelective(record);
        return (Long) newKey;
    }

     public   int updateSelective(User user){
        int rows = uDao.updateSelective(user);
         System.out.println("更新成功");
        return rows;
     }


    public int deleteById(Long id){
        int rows = uDao.deleteById(id);
        System.out.println("删除成功");
        return rows;
    }

    public List<User> selectByParams (Map<String, Object> params){
        List<User> userList =  uDao.selectByParams(params);
        System.out.println("根据参数查询成功");
        return userList;
    }

    public  User  selectByPrimaryKey(Long id){
        User user=    uDao.selectByPrimaryKey(id);
        System.out.println("根据id查询成功");
        return  user;
    }



    public User selectByNick(String username) {
       return uDao.selectByNick(username);
    }
}
