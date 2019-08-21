package com.teste.spring.testeSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.teste.spring.testeSpring.*")
public class TesteSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteSpringApplication.class, args);
	}

}
