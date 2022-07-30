package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration // 뼈대
@ComponentScan //살
public class Chapther02Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapther02Application.class, args);
	}

}
