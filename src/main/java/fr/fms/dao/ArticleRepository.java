package fr.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

	
}
