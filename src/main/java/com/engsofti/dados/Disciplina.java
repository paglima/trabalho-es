package com.engsofti.dados;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Disciplina {
	
	private String id;
	
	private String nome;
	
	private int cargaHoraria;
	
	private TipoDisciplina tipo;
	
	private String nomeProfessor;
	
	private Double media;
	
	private Periodo periodo;
	
	private List<Atividade> atividades; 
	
	public Disciplina(){
	}
	
	public Disciplina(String nome, String nomeProfessor){
		this.nome			= nome;
		this.nomeProfessor	= nomeProfessor;
		atividades = new ArrayList<Atividade>();
	}
	
	
	public double calculaMedia() {
		int soma = 0;
		for (Atividade at : atividades) {
			soma += at.getNota();
		}
		return (soma/(double)atividades.size());
	}
	
	public String geraId(){
		return periodo.toString().replace(".", "")+nome;
	}

	public String getNome() {
		return nome;
	}

	public Disciplina setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public String toString(){
		return this.nome+" ";
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public Disciplina setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
		return this;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public Double getMedia() {
		return media;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public Disciplina setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
		return this;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public Disciplina setPeriodo(Periodo periodo) {
		this.periodo = periodo;
		this.id		 = geraId();
		return this;
	}

	public String getId() {
		return id;
	}

	public Disciplina setId(String id) {
		this.id = id;
		return this;
	}

	

}