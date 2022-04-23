package com.steamlike.steamlike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.steamlike.steamlike.core.mernis.abstracts.PersonCheckService;
import com.steamlike.steamlike.core.mernis.concretes.PersonCheckServiceImpl;

@SpringBootApplication
public class SteamlikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SteamlikeApplication.class, args);	
	}
	
	@Bean
	public PersonCheckService getPersonCheckService() {
		
		return new PersonCheckServiceImpl();
	}

}
