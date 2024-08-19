package dev.justin.movie;

// This class contains a method called run(). You have to call this method and pass your application class to it
import org.springframework.boot.SpringApplication;

// This imports the Spring Boot class annotations. Annotations let you know what the code does.
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

}