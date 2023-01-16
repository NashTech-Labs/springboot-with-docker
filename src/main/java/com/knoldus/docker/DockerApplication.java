package com.knoldus.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {

	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome to Knoldus..!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
