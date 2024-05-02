package com.avaliacaoMapeamentoDados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class AvaliacaoMapeamentoDadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoMapeamentoDadosApplication.class, args);
	}

}
