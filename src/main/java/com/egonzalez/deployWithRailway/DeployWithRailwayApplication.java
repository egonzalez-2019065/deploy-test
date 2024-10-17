package com.egonzalez.deployWithRailway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DeployWithRailwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployWithRailwayApplication.class, args);
	}

	@RestController
	public class Names{

		@GetMapping("/")
		public String getNames(@RequestParam String name){
			// Retorna hola
			return "Hola y bienvenido a la prueba de deploy " + name;
		}

	}

}
