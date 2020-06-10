package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.alunos.professoresmicroservice;

public class Professor {

	private int idProfessor;
	private String numeroTitular;
	private String cpf;
	private String cacher;
	private String nome;
	private int anoIngresso;

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNumeroTitular() {
		return numeroTitular;
	}

	public void setNumeroTitular(String numeroTitular) {
		this.numeroTitular = numeroTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCacher() {
		return cacher;
	}

	public void setCacher(String cacher) {
		this.cacher = cacher;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

}
