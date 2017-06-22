package com.yan.ssm.controller;

import com.yan.ssm.model.User;
import com.yan.ssm.service.UseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * Created by yan on 2017/6/21/0021.
 */
@Controller
@RequestMapping("/use")
public class UseServiceBean {
    private  static Logger logger = Logger.getLogger(String.valueOf(UseServiceBean.class));

    @Resource
    private UseService useService;

    @RequestMapping("/login")
    public String login(@Param("user") String username, @Param("password") String password,Model model)throws Exception{

       User user = useService.checkLogin(username,password);
        if (user!=null){
           logger.info("登陆成功");
           model.addAttribute("user",user);
            return "admin"; //登录成功 跳转到显示页
        }
        return  null;
    }



    // /user/test?id=1
    @RequestMapping("/test")
    public String test(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("userId:"+userId);
        User user=null;
        if (userId==1) {
            user = new User();
            user.setId(1123);
            user.setPassword("123");
            user.setUsername("asddsf");
        }
        model.addAttribute("user", user);
        return "admin";
    }
}
