package com.example.exercice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.exercice")
public class ExerciceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciceApplication.class, args);
	}

}
