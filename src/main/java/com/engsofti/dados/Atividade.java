package com.engsofti.dados;

import org.joda.time.DateTime;

public abstract class Atividade {
	
	private DateTime data;
	private String nome;
	private Double nota;
	private Integer peso;
	private String conteudo;
	
	public abstract String toString();
	
	public DateTime getData() {
		return data;
	}

	public void setData(DateTime data) {
		this.data = data;
	}
	
	public Double getNota() {
		return nota;
	}
	
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public Integer getPeso() {
		return peso;
	}
	
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}