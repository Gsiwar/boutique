package repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Article;

@Repository
public interface ArticleRepositorie extends JpaRepository<Article, Long>{

}
