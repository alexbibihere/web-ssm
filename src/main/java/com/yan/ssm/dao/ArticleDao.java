package com.yan.ssm.dao;

import com.yan.ssm.model.Article;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/7/9/0009.
 */
public interface ArticleDao {


    public void addArticle(Article article);

    Long insertSelective(Article article);

    int updateSelective(Article article);

    int deleteById(int id);

    List<Article> selectByParams (Map<String,Object> params);

    Article selectByPrimaryKey(int id);

    List<Article> selectAllArticle();
}
