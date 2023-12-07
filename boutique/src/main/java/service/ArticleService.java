package service;

import java.util.List;


import model.Article;

public interface ArticleService {
	
	public Article addArticle(Article c);

	public Article editArticle(Article c);

	public Article getArticleById(Long id);
	
	public void deleteArticleById(Long id);
	
	public List<Article> getAllArticles();

}
