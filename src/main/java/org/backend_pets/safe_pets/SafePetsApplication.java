package org.backend_pets.safe_pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class SafePetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafePetsApplication.class, args);
	}

}
