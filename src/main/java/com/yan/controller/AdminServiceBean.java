package com.yan.controller;

import com.yan.model.TblAdmin;
import com.yan.service.AdminService;
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
public class AdminServiceBean implements Serializable{
    private Logger log = Logger.getLogger(AdminServiceBean.class);
    @Autowired
    private AdminService adminService;

    /*@RequestMapping("/select")
    public String getAllUser(HttpServletRequest request){
        List<TblAdmin> tblAdmins = adminService.getAllAdmin();
        log.info("u");
        request.setAttribute("user",tblAdmins);
        return "/allAdmin";
    }*/


 /*   @RequestMapping("/find")
    public String getAllUser(HttpServletRequest request){
        List<TblAdmin> tblAdmins = adminService.findAllUser();
        log.info("u");
        request.setAttribute("user",tblAdmins);
        return "admin";
    }*/
    @RequestMapping("/find")
    public String getAllUser(HttpServletRequest request,Model model) {
        List<TblAdmin> tblAdminList = adminService.findAllUser();
        model.addAttribute("tblAdminList",tblAdminList);
        return "admin";
    }
}
