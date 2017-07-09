package com.yan.ssm.controller;

import com.yan.ssm.model.Article;
import com.yan.ssm.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yan on 2017/7/9/0009.
 */
@Controller
@RequestMapping("/article")
public class ArticleServiceBean {
    @Autowired
    private ArticleService articleService;

    /**
     * 查询所有文章
     */
    @RequestMapping("/getAllArticle")
    public String getAllArticle(HttpServletRequest request, Model model) {
        List<Article> articleList = articleService.selectAllArticle();
        model.addAttribute("articleList", articleList);
        request.setAttribute("articleList", articleList);
        return "article/articleList";
    }

    /**
     * 根据id查询单篇文章
     */
    @RequestMapping("/getArticle")
    public String getArticle(Long id, Model model) {
        model.addAttribute("article", articleService.selectByPrimaryKey(id));
        //request.setAttribute("article", articleService.selectByPrimaryKey(id));
        return "article/editArticle";
    }

    /**
     * 删除文章
     */
    @RequestMapping("/delete")
    public String delete(Long id, Model model) {
        Article article = articleService.selectByPrimaryKey(id);
        System.out.println("删除了" + article);
        articleService.deleteById(id);
        model.addAttribute("article", article);
        return "info";
    }

    /**
     *  更新文章
     */
    @RequestMapping("/update")
    public String updateAdmin(Article article, HttpServletRequest request, Model model) {
        articleService.updateSelective(article);
        Article tblArticle = articleService.selectByPrimaryKey(article.getId());
        System.out.println("修改成功");
        request.setAttribute("tblArticle", tblArticle);
        model.addAttribute("tblArticle", tblArticle);
        return "redirect:/article/getAllArticle";
    }
}
