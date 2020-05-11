package com.home.oraclerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.home.oraclerestapi.controller.PersonaController;

@SpringBootApplication
public class OracleRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OracleRestApiApplication.class, args);
	}
}
