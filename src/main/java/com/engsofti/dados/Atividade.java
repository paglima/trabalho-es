package com.engsofti.dados;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.engsofti.utils.CommonUtil;

public abstract class Atividade {
	
	private DateTime data;
	private Double nota;
	private Integer peso;
	private String conteudo;
	
	public abstract String toString();
	
	public DateTime getData() {
		return data;
	}

	public void setData(String dataHora) {
		this.data = CommonUtil.stringToDateTime(dataHora);
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

}