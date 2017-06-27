package com.yan.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.yan.ssm.model.TblAdmin;
import com.yan.ssm.service.AdminService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.List;

/**
 * Created by yan on 2017/6/20/0020.
 */
@Controller
@RequestMapping("/admin")
public class AdminServiceBean implements Serializable {
    private Logger log = Logger.getLogger(AdminServiceBean.class);
    @Autowired
    private AdminService adminService;


    @RequestMapping("/login")
    public String login(String username,Model model) {
            TblAdmin u = adminService.selectByNick(username);
            System.out.println(u);
            if (u != null) {
                List<TblAdmin> user = adminService.findAllUser();
                model.addAttribute("user", user);
                System.out.println("user"+user);
                return "admin";
            }
        return "fail";
    }


    @RequestMapping("/getUser")
    public String getAllUser(HttpServletRequest request, Model model) {
        List<TblAdmin> user = adminService.findAllUser();
        model.addAttribute("user", user);
        request.setAttribute("user",user);
        return "/admin";
    }

    @ResponseBody
    @RequestMapping("/delete")
    public void deleteAdmin(Long id,HttpServletRequest request, HttpServletResponse response) {
        String result = "{\"result\":\"error\"}";
        if (adminService.deleteByPrimaryKey(id) > 0) {
            result = "{\"result\":\"success\"}";
        }
        response.setContentType("application/json");
        try {
            PrintWriter out = response.getWriter();
            out.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
/*
        TblAdmin  admin= adminService.selectByPrimaryKey(id);
        adminService.deleteByPrimaryKey(id);
        System.out.println("删除"+admin+"成功");
        model.addAttribute("admin",admin);
        return "success";*/
    }


    @RequestMapping("add")
    public String addAdmin(TblAdmin admin) {
        Long id = adminService.insertSelective(admin);
        TblAdmin admin1 = adminService.selectByPrimaryKey(id);
        System.out.println("添加成功");
        System.out.println(JSONObject.toJSONString(admin1));
        return "admin";
    }

    @RequestMapping("update")
    public String updateAdmin(TblAdmin admin,HttpServletRequest request, Model model) {
        adminService.updateByPrimaryKey(admin);
        TblAdmin tblAdmin = adminService.selectByPrimaryKey(admin.getId());
        System.out.println("修改成功");
        request.setAttribute("tblAdmin",tblAdmin);
        model.addAttribute("tblAdmin",tblAdmin);
        return "admin";
    }
}
