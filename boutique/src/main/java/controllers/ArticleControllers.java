package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import models.Article;
import services.ArticleService;



public class ArticleControllers {

	
	
	
	@Autowired
	private ArticleService articleService;

	@PostMapping
	public Article addArticle(@RequestBody Article c) {
		return articleService.addArticle(c);
	}

	@GetMapping("/{id}")
	public Article getArticle(@PathVariable Long id) {
		return articleService.getArticleById(id);
	}

	@GetMapping
	public List<Article> getAllArticles() {
		return articleService.getAllArticles();
	}

	@DeleteMapping("/{id}")
	public void deleteArticle(@PathVariable Long id) {
		articleService.deleteArticleById(id);
	}

	@PutMapping("/{id}")
	public Article editArticle(@RequestBody Article c) {
		return articleService.editArticle(c);
	}
}
