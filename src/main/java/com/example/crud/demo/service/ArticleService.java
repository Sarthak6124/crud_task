package com.example.crud.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.demo.entity.Article;
import com.example.crud.demo.repository.ArticleRepository;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository articlerepository;
	
	public Article savearticle(Article article) {
		return articlerepository.save(article);
	}
	
	public List<Article> savearticles(List<Article> article) {
		return articlerepository.saveAll(article);
	}
	public List<Article> getallarticle() {
		return articlerepository.findAll();
	}
	public Article getArticleById(int id) {
 	return articlerepository.findById(id).orElse(null);
	}
	public Article getArticleByName(String name) {
	 	return articlerepository.findByTitle(name);
		}
	public String deletearticle(int id) {
		 articlerepository.deleteById(id);
		 return "product removed id"+id;
	}
	public Article updatearticle (Article article) {
	
		Article existingarticle = articlerepository.findById(article.getId()).orElse(null); 
		existingarticle.setTitle(article.getTitle());
		existingarticle.setContent(article.getContent());
		
		return articlerepository.save(existingarticle);
	}
	
	
}
