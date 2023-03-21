package com.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.client.RestTemplate;

//@EnableReactiveMongoRepositories
@SpringBootApplication
public class MongoReactiveService2Application {

	public static void main(String[] args) {
		SpringApplication.run(MongoReactiveService2Application.class, args);
	}
	 @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }

}
