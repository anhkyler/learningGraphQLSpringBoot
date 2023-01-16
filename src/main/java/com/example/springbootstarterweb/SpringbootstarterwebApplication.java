package com.example.springbootstarterweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ControllerAdvice;

@SpringBootApplication
@ComponentScan("com.example")
public class SpringbootstarterwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootstarterwebApplication.class, args);
	}

}
