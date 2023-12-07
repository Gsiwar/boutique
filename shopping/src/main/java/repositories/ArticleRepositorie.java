package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import models.Article;

@Repository
public interface ArticleRepositorie extends JpaRepository<Article, Long>{

}
