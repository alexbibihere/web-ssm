package com.yan.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.yan.ssm.model.TblAdmin;
import com.yan.ssm.service.AdminService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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


    @RequestMapping("/find")
    public String getAllUser(HttpServletRequest request, Model model) {
        List<TblAdmin> user = adminService.findAllUser();
        model.addAttribute("user", user);
        return "admin";
    }

    @RequestMapping("delete")
    public String deleteAdmin(Long id) {
        adminService.deleteByPrimaryKey(id);
        System.out.println("删除成功");
        return "admin";
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
    public String updateAdmin(TblAdmin admin) {
        adminService.updateByPrimaryKey(admin);
        System.out.println("修改成功");
        return "admin";
    }
}
