package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.disciplinas.disciplinasmicroservice;

public class Disciplina {

	private int idDisciplina;
	private String nome;
	private int ano;
	private int periodoLetivo;

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPeriodoLetivo() {
		return periodoLetivo;
	}

	public void setPeriodoLetivo(int periodoLetivo) {
		this.periodoLetivo = periodoLetivo;
	}

}
