package com.slash.lash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.slash.lash.repository")
public class LashApplication {

	public static void main(String[] args) {
		SpringApplication.run(LashApplication.class, args);
	}

}
