package com.antoalex.backend.learnspringboot;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.antoalex.backend.learnspringboot.model.Content;
import com.antoalex.backend.learnspringboot.model.Status;
import com.antoalex.backend.learnspringboot.model.Type;
import com.antoalex.backend.learnspringboot.repository.ContentRepository;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			Content content = new Content(null, 
			"The New World",
			"All about the coming times",
			Status.IDEA,
			Type.VIDEO,
			LocalDateTime.now(),
			null,
			"");

			repository.save(content);
		};
	}
}
