package com.yan.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.yan.ssm.model.TblAdmin;
import com.yan.ssm.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/6/20/0020.
 */
@Controller
@RequestMapping("/admin")
public class AdminServiceBean implements Serializable {
    private Logger logger = Logger.getLogger(AdminServiceBean.class);
    @Autowired
    private AdminService adminService;


    @RequestMapping("/login")
    public String login(@Param("user") String username, @Param("password") String password, Model model) throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        adminService.checkLogin(username, password);
        List<TblAdmin> adminList = adminService.selectByParams(params);
        if (adminList != null) {
            logger.info("登陆成功");
            model.addAttribute("adminList", adminList);
            return "admin"; //登录成功 跳转到显示页
        }
        return "fail";
    }

    @RequestMapping("/getAllUser")
    public String getAllUser(HttpServletRequest request, Model model) {
        List<TblAdmin> adminList = adminService.findAllUser();
        model.addAttribute("adminList", adminList);
        request.setAttribute("adminList", adminList);
        return "admin";
    }

    /**
     *根据id查询单个用户
     */
    @RequestMapping("/getUser")
    public String getUser(int id,HttpServletRequest request, Model model) {
        model.addAttribute("user",  adminService.selectByPrimaryKey(id));
        request.setAttribute("user",  adminService.selectByPrimaryKey(id));
        return "edit";
    }

    /**
     * 用户删除
     */
    @RequestMapping("/delete")
    public String deleteUser(int id,Model model) {
        TblAdmin user = adminService.selectByPrimaryKey(id);
        System.out.println("删除了" + user);
        adminService.deleteByPrimaryKey(id);
        model.addAttribute("user",user);
        return "info";
    }


    @RequestMapping("add")
    public String addAdmin(TblAdmin admin) {
        int id = adminService.insertSelective(admin);
        TblAdmin admin1 = adminService.selectByPrimaryKey(id);
        System.out.println("添加成功");
        System.out.println(JSONObject.toJSONString(admin1));
        return "admin";
    }

    @RequestMapping("update")
    public String updateAdmin(TblAdmin admin, HttpServletRequest request, Model model) {
        adminService.updateByPrimaryKey(admin);
        TblAdmin tblAdmin = adminService.selectByPrimaryKey(admin.getId());
        System.out.println("修改成功");
        request.setAttribute("tblAdmin", tblAdmin);
        model.addAttribute("tblAdmin", tblAdmin);
        return "redirect:/admin/getAllUser";
    }
}
