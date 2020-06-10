package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.disciplinas.disciplinasmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class DisciplinasMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisciplinasMicroserviceApplication.class, args);
	}

}
