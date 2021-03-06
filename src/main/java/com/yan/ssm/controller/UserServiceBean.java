package com.yan.ssm.controller;

import com.yan.ssm.model.User;
import com.yan.ssm.service.UseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * 用户相关方法
 * Created by yan on 2017/6/21/0021.
 */
@Controller
@RequestMapping("/user")
public class UserServiceBean {
    private static Logger logger = Logger.getLogger(String.valueOf(UserServiceBean.class));
    @Resource
    private UseService useService;

    @RequestMapping("/login")
    public String login(@Param("user") String username, @Param("password") String password, Model model) throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        // 检查用户是否注册 如果注册，允许登录跳转
        useService.checkLogin(username, password);
        List<User> user = useService.selectByParams(params);
        if (user != null) {
            logger.info(" 登录成功");
            model.addAttribute("user", user);
            return "user/userList"; //登录成功 跳转到显示页
        }
        return "fail";
    }

    @RequestMapping("/checkUsername")
    public Boolean checkUsername(String username){
       User user =useService.selectByNick(username);
        if (user != null){
            return true;
        }
        return  false;
    }

    /**
     * 用户注册
     */
    @RequestMapping("/register")
    public String register(String username, String password,String sex, Model model) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSex(sex);
        User u = useService.selectByNick(username);
        if (u == null) {
            useService.insertSelective(user);
            return "redirect:/user/getAllUser";
        }
        model.addAttribute("user", user);
        return "fail";
    }

    /**
     * 用户删除
     */
    @RequestMapping("/delete")
    public String deleteUser(int id, HttpServletRequest request, Model model) {
        //String id = request.getParameter("id");
        System.out.println(id);
        User user = useService.selectByPrimaryKey(id);
        //useService.selectByNick(username);
        useService.deleteById(id);
        model.addAttribute("user", user);
        return "info";
    }

    /**
     * 查询用户列表
     */
    @RequestMapping("/getAllUser")
    public String getUsers(Model model) {
        Map<String, Object> params = new HashMap<String, Object>();
        List<User> user = useService.selectByParams(params);
        model.addAttribute("user", user);
        return "user/userList";
    }

    /**
     * 根据id查询单个用户
     */
    @RequestMapping("/getUser")
    public String getUser(int id, HttpServletRequest request, Model model) {
        model.addAttribute("user", useService.selectByPrimaryKey(id));
        request.setAttribute("user", useService.selectByPrimaryKey(id));
        return "user/editUser";
    }

    /**
     * 修改用户信息
     */
    @RequestMapping("/update")
    public String updateAdmin(User user, HttpServletRequest request, Model model) {
        useService.updateSelective(user);
        User tblUser = useService.selectByPrimaryKey(user.getId());
        System.out.println("修改成功");
        request.setAttribute("tblUser", tblUser);
        model.addAttribute("tblUser", tblUser);
        return "redirect:/user/getAllUser";

    }

    /**
    * 文件上传
     */
    @RequestMapping("/upload")
    public String upload(MultipartFile file,HttpServletRequest request) throws IOException {
        String name = file.getOriginalFilename();
        File uploadF = new File("/"+name);
        file.transferTo(uploadF);
        return  "article";
    }
}
