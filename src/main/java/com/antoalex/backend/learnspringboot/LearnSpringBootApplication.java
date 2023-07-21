package com.antoalex.backend.learnspringboot;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.antoalex.backend.learnspringboot.config.ContentCalendarProperties;
import com.antoalex.backend.learnspringboot.model.Content;
import com.antoalex.backend.learnspringboot.model.Status;
import com.antoalex.backend.learnspringboot.model.Type;
import com.antoalex.backend.learnspringboot.repository.ContentRepository;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			Content content = new Content(null, 
			 "Strongest of the Strongest",
			 "One piece OST's", 
			 Status.IDEA, 
			 Type.VIDEO, 
			 LocalDateTime.now(), 
			 null, 
			 "http://localhost:8080/api/content");

			repository.save(content);
		};
	}
}