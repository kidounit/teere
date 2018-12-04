package com.kidounit.teere.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.mongobee.Mongobee;
import com.mongodb.MongoClient;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}
	
	@Bean
	public Mongobee mongobee(){
	  Mongobee runner = new Mongobee("mongodb://localhost:27017/teere-dev");
	  runner.setDbName("teere-dev");         // host must be set if not set in URI
	  runner.setChangeLogsScanPackage(
	       "com.kidounit.teere.changelogs"); // the package to be scanned for changesets
	  
	  return runner;
	}
	
	/*public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		
		MongoTemplate mongoTemplate = 
			new MongoTemplate(new MongoClient("127.0.0.1"),"teere-dev");
		return mongoTemplate;
		
	}*/
}
