package com.springboot.moviemoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.moviemoon")
public class MoviemoonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviemoonApplication.class, args);
	}

}
