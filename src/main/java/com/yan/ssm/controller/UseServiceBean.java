package com.yan.ssm.controller;

import com.yan.ssm.dao.UDao;
import com.yan.ssm.model.TblAdmin;
import com.yan.ssm.model.User;
import com.yan.ssm.service.UseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * 用户相关方法
 *
 * Created by yan on 2017/6/21/0021.
 */
@Controller
@RequestMapping("/use")
public class UseServiceBean {
    private  static Logger logger = Logger.getLogger(String.valueOf(UseServiceBean.class));
    @Autowired
    private UDao uDao;
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
            user.setId(Long.valueOf(4));
            user.setPassword("123");
            user.setUsername("asddsf");
        }
        model.addAttribute("user", user);
        return "admin";
    }

    /*
    * 用户注册
    */
    @RequestMapping("/register")
    public String register(String username,String password,Model model) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User u= useService.selectByNick(username);
        if (u == null) {
            useService.insertSelective(user);
            return "success";
        }
        model.addAttribute("user",user);
        return "fail";
    }

    /*
   * 用户删除
   */
    @RequestMapping("/delete")
    public String deleteUser(Long id,Model model) {
       User user= useService.selectByPrimaryKey(id);
        useService.deleteById(id);
        model.addAttribute("user",user);
        return "info";
    }

    /**
     * 查询用户列表
     *
     * @param model
     * @return
     */
    @RequestMapping("/select")
    public String getUsers(Model model) {
        Map<String,Object> params= new HashMap<String,Object>();
        List<User> user= useService.selectByParams(params);
        model.addAttribute("user",user);
        return "userList";
    }
}
