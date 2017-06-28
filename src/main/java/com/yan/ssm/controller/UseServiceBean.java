package com.yan.ssm.controller;

import com.yan.ssm.model.User;
import com.yan.ssm.service.UseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * 用户相关方法
 * Created by yan on 2017/6/21/0021.
 */
@Controller
@RequestMapping("/use")
public class UseServiceBean {
    private static Logger logger = Logger.getLogger(String.valueOf(UseServiceBean.class));
    @Resource
    private UseService useService;

    @RequestMapping("/login")
    public String login(@Param("user") String username, @Param("password") String password, Model model) throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        // 检查用户是否注册 如果注册，允许登录跳转
        useService.checkLogin(username, password);
        List<User> user = useService.selectByParams(params);
        if (user != null) {
            logger.info("登陆成功");
            model.addAttribute("user", user);
            return "userList"; //登录成功 跳转到显示页
        }
        return null;
    }

    /**
    * 用户注册
    */
    @RequestMapping("/register")
    public String register(String username, String password, Model model) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User u = useService.selectByNick(username);
        if (u == null) {
            useService.insertSelective(user);
            return "success";
        }
        model.addAttribute("user", user);
        return "fail";
    }

    /**
     * 用户删除
     */
    @RequestMapping("/delete")
    public String deleteUser(int id,HttpServletRequest request, Model model) {
        //String id = request.getParameter("id");
        System.out.println(id);
        User user =useService.selectByPrimaryKey(id);
         //useService.selectByNick(username);
        useService.deleteById(id);
        model.addAttribute("user", user);
        return "info";
    }

    /**
     * 查询用户列表
     */
    @RequestMapping("/select")
    public String getUsers(Model model) {
        Map<String, Object> params = new HashMap<String, Object>();
        List<User> user = useService.selectByParams(params);
        model.addAttribute("user", user);
        return "userList";
    }

    /**
     * 修改用户信息
     *
     */
    @RequestMapping("/update")
    public String updateAdmin(User user,HttpServletRequest request, Model model) {
        useService.updateSelective(user);
        User tblUser = useService.selectByPrimaryKey(user.getId());
        System.out.println("修改成功");
        request.setAttribute("tblUser",tblUser);
        model.addAttribute("tblUser",tblUser);
        return "admin";
    }
}
