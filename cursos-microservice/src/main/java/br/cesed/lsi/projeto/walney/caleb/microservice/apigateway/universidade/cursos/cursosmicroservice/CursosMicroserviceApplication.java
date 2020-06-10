package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.cursos.cursosmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class CursosMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosMicroserviceApplication.class, args);
	}

}
