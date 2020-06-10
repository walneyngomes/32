package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.cursos.cursosmicroservice;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/insurance-config-server/cursos")
public class CursoController {

	
	@GetMapping("/cursos")
	public List<Curso> findAll(){
		return (List<Curso>) Stream.of("walney","2313",233);
	}
	
	
}

