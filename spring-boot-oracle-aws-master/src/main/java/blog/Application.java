package blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication /* implies @Configuration, @EnableAutoConfiguration and @ComponentScan  */
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }

}
