package com.example.SpringBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.SpringBootTest.controller.TestController"})
@SpringBootApplication
public class SpringBootTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest2Application.class, args);
	}

}
