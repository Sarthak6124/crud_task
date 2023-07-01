package com.example.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.demo.entity.Article;
import com.example.crud.demo.service.ArticleService;

@RestController
//@RequestMapping("/api")
public class ArticleController {

    @Autowired
	private ArticleService articleservice;

    @PostMapping("/addarticle")
    public Article addArticle(@RequestBody Article article) {
    	return articleservice.savearticle(article);
    }
    @PostMapping("/addArticles")
    public List<Article> addArticles(@RequestBody List<Article> articles) {
    	return articleservice.savearticles(articles);
    }
    @GetMapping("/getallarticle")
    public List<Article> findAllArticles() {
    	return articleservice.getallarticle();
    }
    @GetMapping("/getbyid/{id}")
    public Article findArticleById(@PathVariable int id) {
    	return articleservice.getArticleById(id);
    }
    @GetMapping("/getbyname/{name}")
    public Article findArticleByName(@PathVariable String name) {
    	return articleservice.getArticleByName(name);
    }
    

    @PutMapping("/update")
    public Article updateArticle(@RequestBody Article article) {
    	return articleservice.updatearticle(article);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id ) {
    	return articleservice.deletearticle(id);
    }
    
}
