package com.yan.ssm.service;

import com.yan.ssm.model.Article;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2017/7/9/0009.
 */
public interface ArticleService {

    public void insertSelective(Article article);

    int updateSelective(Article article);

    int deleteById(Long id);

    List<Article> selectByParams (Map<String,Object> params);

    Article selectByPrimaryKey(Long id);

    List<Article> selectAllArticle();
}
