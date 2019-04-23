package com.hp.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydemoApplication.class, args);
	}

}
