package services;

import java.util.List;

import org.springframework.stereotype.Service;

import models.Article;
@Service
public interface ArticleService {
	
	public Article addArticle(Article c);

	public Article editArticle(Article c);

	public Article getArticleById(Long id);
	
	public void deleteArticleById(Long id);
	
	public List<Article> getAllArticles();

}
