package com.example.emailExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.emailExample"})
public class EmailExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailExampleApplication.class, args);
	}
}
