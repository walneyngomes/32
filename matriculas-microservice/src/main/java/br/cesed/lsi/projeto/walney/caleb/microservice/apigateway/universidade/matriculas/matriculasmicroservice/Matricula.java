package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.matriculas.matriculasmicroservice;

public class Matricula {

	private int idMatricula;
	private int anoIngresso;
	private String tipoIngresso;

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public String getTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}

}
