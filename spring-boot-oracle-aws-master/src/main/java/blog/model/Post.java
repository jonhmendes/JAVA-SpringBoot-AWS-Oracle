package blog.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bbn on 31/03/17.
 */
@Entity
public class Post {
  @Id   /* specifies it as primary key */
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String body;
  @Column(name = "PUBLISHED_DATE")
  private Date publishedDate;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Date getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
  }
}
