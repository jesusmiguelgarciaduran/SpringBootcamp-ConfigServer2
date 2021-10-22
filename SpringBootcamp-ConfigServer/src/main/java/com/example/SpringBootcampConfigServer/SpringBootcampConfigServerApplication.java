package com.example.SpringBootcampConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigServer
@SpringBootApplication
public class SpringBootcampConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootcampConfigServerApplication.class, args);
	}

}
