package blog.repository;

import blog.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bbn on 31/03/17.
 */
public interface PostRepository extends CrudRepository<Post, Long> {
  Post findById(@Param("id") Long id);

  List<Post> findAll();

  List<Post> findByTitle(@Param("title") String title);
}
