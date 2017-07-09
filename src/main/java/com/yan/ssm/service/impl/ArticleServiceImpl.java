package com.yan.ssm.service.impl;

import com.yan.ssm.dao.ArticleDao;
import com.yan.ssm.model.Article;
import com.yan.ssm.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/7/9/0009.
 */

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public void insertSelective(Article article) {
        articleDao.insertSelective(article);
        System.out.println("添加文章成功:insertSelective");
        return;
    }

    public int updateSelective(Article article) {
        int rows = articleDao.updateSelective(article);
        if (rows>0) {
            System.out.println("更新文章成功:updateSelective");
        }
        return  rows;
    }

    public int deleteById(Long id) {
      int rows =   articleDao.deleteById(id);
        if (rows>0) {
            System.out.println("删除文章成功:deleteById");
        }
        return rows;
    }

    public List<Article> selectByParams(Map<String, Object> params) {
            List<Article>   articleList = articleDao.selectByParams(params);
        System.out.println("根据参数查询成功:selectByParams");
            return  articleList;
    }

    public Article selectByPrimaryKey(Long id) {
        Article user=    articleDao.selectByPrimaryKey(id);
        System.out.println("根据id查询成功:selectByPrimaryKey");
        return  user;
    }

    public List<Article> selectAllArticle(){
        List<Article> articleList = articleDao.selectAllArticle();
        return  articleList;
    }
}
