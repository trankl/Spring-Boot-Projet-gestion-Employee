package com.example.NewProjetSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@Data
@SpringBootApplication
public class NewProjetSpringApplication implements CommandLineRunner {

	@Autowired
    private CustomProperties properties;
	
	public static void main(String[] args) {
		SpringApplication.run(NewProjetSpringApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
        System.out.println(properties.getApiUrl());
    
    }
}
