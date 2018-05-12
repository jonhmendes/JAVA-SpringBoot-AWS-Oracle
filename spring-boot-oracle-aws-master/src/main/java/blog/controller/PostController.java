package blog.controller;

import blog.model.Post;
import blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bbn on 31/03/17.
 */
@RestController
@RequestMapping("posts")
public class PostController {

  private final PostRepository postRepository;

  @Autowired /* constructor injection is preferable as it is explicit */
  public PostController(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @RequestMapping(method = RequestMethod.GET)
  public List<Post> getByTitle(@RequestParam(value = "title", required = false) String title){
    if (title == null)
      return postRepository.findAll();
    else
      return postRepository.findByTitle(title);
  }

  @RequestMapping(value="/{id}", method = RequestMethod.GET)
  public Post getById(@PathVariable("id") Long id){
    return postRepository.findById(id);
  }
}
