package com.leon.leonbootlaunch.service;

import com.leon.leonbootlaunch.dao.ArticleJDBCDAO;
import com.leon.leonbootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ArticleRestJDBCServiceImpl implements ArticleRestService {

    @Resource
    ArticleJDBCDAO articleJDBCDAO;

    @Override
    public Article saveArticle(Article article) {

        articleJDBCDAO.save(article);

        return article;
    }

    @Override
    public void deleteArticle(Long id) {
        articleJDBCDAO.deleteById(id);
    }

    @Override
    public void updateArticle(Article article) {

        articleJDBCDAO.updateById(article);
    }

    @Override
    public Article getArticle(Long id) {

        return articleJDBCDAO.findById(id);

    }

    @Override
    public List<Article> getAll() {
        return articleJDBCDAO.findAll();
    }
}
