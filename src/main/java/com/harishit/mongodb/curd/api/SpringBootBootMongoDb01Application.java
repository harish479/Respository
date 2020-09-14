package com.harishit.mongodb.curd.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBootBootMongoDb01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBootMongoDb01Application.class, args);
	}

}
