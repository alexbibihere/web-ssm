package com.yan.ssm.controller;

import com.yan.ssm.model.TblUser;
import com.yan.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserServiceBean implements Serializable{

    private Logger log = Logger.getLogger(UserServiceBean.class);
    @Autowired
    private UserService userService;

   /* @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }*/


    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");

        List<TblUser> tblUserList = userService.getAllUser();
        model.addAttribute("tblUserList", tblUserList);

        return "showUser";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model){
       try{
           log.info("登录");
           String user = userService.selectByNick();
           model.addAttribute("user", user);
       }catch (Exception e){
       }
        return "welcome";
    }

    @RequestMapping("/select")
    public String getAllUser(HttpServletRequest request){
            List<TblUser> tblUsers = userService.getAllUser();
            request.setAttribute("user",tblUsers);
        return "login";
    }



    public List<TblUser> getAllUser() {
        List<TblUser> tblUsers = userService.getAllUser();
        return tblUsers;
    }


}
