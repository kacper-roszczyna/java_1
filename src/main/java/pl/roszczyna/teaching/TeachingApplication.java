package pl.roszczyna.teaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.roszczyna.teaching.objects.Author;
import pl.roszczyna.teaching.objects.AuthorType;

@SpringBootApplication
public class TeachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachingApplication.class, args);
	}

}
