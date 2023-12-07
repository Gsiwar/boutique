package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Article;
import repositories.ArticleRepositorie;
import services.ArticleService;

@Service
public class ArticleServiceImpl  implements ArticleService {

	final ArticleRepositorie articleRepositorie;

    @Autowired
    public ArticleServiceImpl(ArticleRepositorie ArticleRepositorie) {
        this.articleRepositorie = ArticleRepositorie;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepositorie.findAll();
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepositorie.findById(id).orElse(null);
    }

    public Article addArticle1(Article a) {
        return articleRepositorie.save(a);
    }

    public void deleteArticle(Long id) {
    	articleRepositorie.deleteById(id);
    }

	@Override
	public Article addArticle(Article c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article editArticle(Article c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteArticleById(Long id) {
		// TODO Auto-generated method stub
		
	}
}
