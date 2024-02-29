package com.example.finalcicdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FinalCicdProjectApplication {

	public String ameth(){
		return "aomoajihiajdhs";
	}


	public static void main(String[] args) {
		SpringApplication.run(FinalCicdProjectApplication.class, args);
	}

}
