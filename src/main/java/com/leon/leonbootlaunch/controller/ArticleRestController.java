package com.leon.leonbootlaunch.controller;

import com.leon.leonbootlaunch.model.AjaxResponse;
import com.leon.leonbootlaunch.model.Article;

import io.swagger.annotations.ApiOperation;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/rest")
public class ArticleRestController {

/*
    @ApiOperation(value="保存",notes = "SAVE2",tags = "保存文章",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 200,message = "成功",response = AjaxResponse.class)
    })
    //@RequestMapping(value = "/article",method = POST,produces = "application/json")*/


    @PostMapping("/article")
    public @ResponseBody  AjaxResponse saveArticle(@RequestBody Article article) {

        log.info("saveArticle: {}",article);
        return AjaxResponse.success(article);
    }

    @DeleteMapping("/article/{id}")
    public @ResponseBody AjaxResponse deleteArticle(@PathVariable Long id) {

        log.info("deleteArticle: {}",id);
        return AjaxResponse.success(id);


    }

    @PutMapping("article/{id}")
    public @ResponseBody AjaxResponse updateArticle(@PathVariable Long id,@RequestBody Article article) {

        log.info("updateArticle: {}",id);
        return AjaxResponse.success(article);

    }

    @GetMapping("article/{id}")
    public @ResponseBody AjaxResponse getArticle(@PathVariable Long id) {

        System.out.println("GetArticle");
        Article article = Article.builder().id(1L).author("Leon").content("How use Spring2.0").title("Spring2.0").build();
        return AjaxResponse.success(article);
    }
}
