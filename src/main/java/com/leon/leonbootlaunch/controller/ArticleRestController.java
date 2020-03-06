package com.leon.leonbootlaunch.controller;

import com.leon.leonbootlaunch.model.AjaxResponse;
import com.leon.leonbootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@Controller
@RequestMapping("/rest")
public class ArticleRestController {


    @RequestMapping(value = "/article",method = POST,produces = "application/json")
    //@PostMapping("/article")
    public @ResponseBody  AjaxResponse saveArticle(@RequestBody Article article) {

        log.info("saveArticle: {}",article);
        return AjaxResponse.success(article);
    }

    public AjaxResponse deleteArticle(Long id) {

        log.info("deleteArticle: {}",id);
        return AjaxResponse.success(id);

    }

    public AjaxResponse updateArticle(Long id,Article article) {

        log.info("updateArticle: {}",id);
        return AjaxResponse.success(article);

    }

    public AjaxResponse getArticle(Long id) {

        Article article=Article.builder().id(1L).author("Leon").content("How use Spring2.0").title("Spring2.0").build();
        return AjaxResponse.success(article);
    }
}
