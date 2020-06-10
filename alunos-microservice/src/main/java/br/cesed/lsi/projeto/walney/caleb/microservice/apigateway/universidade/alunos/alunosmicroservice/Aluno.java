package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.alunos.alunosmicroservice;

import java.util.ArrayList;

import br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.alunos.professoresmicroservice.Professor;

public class Aluno {

	private int idAluno;
	private String nomeAluno;
	private String cpf;
	private int anoIngresso;
	private int idade;
	
 
	
    
    
	public Aluno(int idAluno, String nomeAluno, String cpf, int anoIngresso, int idade) {
		super();
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.cpf = cpf;
		this.anoIngresso = anoIngresso;
		this.idade = idade;
	
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
	
}
