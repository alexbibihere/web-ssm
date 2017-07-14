package com.yan.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.yan.ssm.model.Admin;
import com.yan.ssm.service.AdminService;
import com.yan.ssm.utils.MD5Util;
import com.yan.ssm.utils.StringUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.yan.ssm.utils.MD5Util.MD5Encode;

/**
 * Created by yan on 2017/6/20/0020.
 */
@Controller
@RequestMapping("/admin")
public class AdminServiceBean implements Serializable {
    private Logger logger = Logger.getLogger(AdminServiceBean.class);
    @Autowired
    private AdminService adminService;

    /**
     * 管理员登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request, Model model) throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin admin = adminService.selectByUsername(username);
        // 如果用户名不为空 且密码相同 验证通过
        if (admin != null) {
            if (MD5Util.checkPassword(password, admin.getPassword())) {
                request.getSession().setAttribute("adminInfo", admin);
                return "login_success";
            } else {
                return "login_fail";
            }
        } else {
            return "login_fail";
        }
    }

    @RequestMapping("/logout")
    public String logou(HttpSession session) {
        session.removeAttribute("username");
        return "login";
    }

    /**
     * 查询所有管理员
     */
    @RequestMapping("/getAllAdmin")
    public String getAllAdmin(HttpServletRequest request, Model model) {
        List<Admin> adminList = adminService.findAllUser();
        model.addAttribute("adminList", adminList);
        request.setAttribute("adminList", adminList);
        return "admin/admin";
    }

    /**
     * 根据id查询单条数据
     */
    @RequestMapping("/getAdmin")
    public String getAdmin(int id, HttpServletRequest request, Model model) {
        model.addAttribute("user", adminService.selectByPrimaryKey(id));
        request.setAttribute("user", adminService.selectByPrimaryKey(id));
        return "admin/editAdmin";
    }

    /**
     * 管理员删除
     */
    @RequestMapping("/delete")
    public String delete(int id, Model model) {
        Admin user = adminService.selectByPrimaryKey(id);
        System.out.println("删除了" + user);
        adminService.deleteByPrimaryKey(id);
        model.addAttribute("user", user);
        return "info";
    }

    /**
     * 添加管理员
     */
    @RequestMapping("/register")
    public String addAdmin(HttpServletRequest request) {
        Admin admin = new Admin();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        admin.setUsername(username);
        admin.setPassword(MD5Encode(password, "UTF-8"));
        int id = adminService.insert(admin);
        Admin admin1 = adminService.selectByPrimaryKey(id);
        System.out.println("添加成功");
        System.out.println(JSONObject.toJSONString(admin1));
        return "redirect:/admin/getAllAdmin";
    }

    /**
     * 修改管理员信息
     */
    @RequestMapping("/update")
    public String updateAdmin(Admin admin, HttpServletRequest request, Model model) {
        adminService.updateByPrimaryKey(admin);
        Admin tblAdmin = adminService.selectByPrimaryKey(admin.getId());
        System.out.println("修改成功");
        request.setAttribute("tblAdmin", tblAdmin);
        model.addAttribute("tblAdmin", tblAdmin);
        return "redirect:/admin/getAllAdmin";
    }
}
