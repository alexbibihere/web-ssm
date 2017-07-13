package com.yan.ssm.controller;

import com.yan.ssm.model.Notice;
import com.yan.ssm.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yandeguang on 2017/7/13/0013.
 */
@Controller
@RequestMapping("/notice")
public class NoticeServiceBean {
    @Autowired
    private NoticeService noticeService;

    /**
     * 添加新文章
     */
    @RequestMapping("add")
    public String addNotice(Notice Notice){
        noticeService.insert(Notice);

        System.out.println();
        return "success";

    }

    /**
     * 查询所有文章
     */
    @RequestMapping("/getAllNotice")
    public String getAllNotice(HttpServletRequest request, Model model) {
        List<Notice> noticeList = noticeService.selectAllNotice();
        model.addAttribute("noticeList", noticeList);
        request.setAttribute("noticeList", noticeList);
        return "Notice/NoticeList";
    }

    /**
     * 根据id查询单篇文章
     */
    @RequestMapping("/getNotice")
    public String getNotice(Long id, Model model) {
        model.addAttribute("notice", noticeService.selectByPrimaryKey(id));
        //request.setAttribute("Notice", NoticeService.selectByPrimaryKey(id));
        return "Notice/editNotice";
    }

    /**
     * 删除文章
     */
    @RequestMapping("/delete")
    public String delete(Long id, Model model) {
        Notice notice = noticeService.selectByPrimaryKey(id);
        System.out.println("删除了" + notice);
        noticeService.deleteByPrimaryKey(id);
        model.addAttribute("notice", notice);
        return "info";
    }

 /*   *//**
     *  更新文章
     *//*
    @RequestMapping("/update")
    public String updateAdmin(Notice Notice, HttpServletRequest request, Model model) {
        NoticeService.updateSelective(Notice);
        Notice tblNotice = NoticeService.selectByPrimaryKey(Notice.getId());
        System.out.println("修改成功");
        request.setAttribute("tblNotice", tblNotice);
        model.addAttribute("tblNotice", tblNotice);
        return "redirect:/Notice/getAllNotice";
    }*/
}
