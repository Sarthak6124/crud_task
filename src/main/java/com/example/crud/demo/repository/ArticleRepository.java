package com.example.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.demo.entity.Article;

public interface ArticleRepository extends JpaRepository<Article,Integer> {
	Article findByTitle(String title);
}
