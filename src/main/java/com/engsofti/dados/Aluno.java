package com.engsofti.dados;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Aluno{

	private String nome;
	
	private String senha;
	
	private String matricula;
	
	private Curso curso;
	
	private String email;

	private double cr;
	
	private Integer cargaHorariaCursada;
	
	private ArrayList<Disciplina> disciplinas;
	
	public Aluno(){
		disciplinas=new ArrayList<Disciplina>();
	}
	
	
	public Disciplina encontraDisciplinaPeloNome(String nome){
		for (Disciplina d : disciplinas) {
			if(d.getNome().equals(nome)){
				return d;
			}
		}
		return null;
	}
	
	public String getNome() {
		return nome;
	}

	public Aluno setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getMatricula() {
		return matricula;
	}

	public Aluno setMatricula(String matricula) {
		this.matricula = matricula;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Aluno setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getSenha() {
		return senha;
	}

	public Aluno setSenha(String senha) {
		this.senha = senha;
		return this;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public double getCr() {
		return cr;
	}

	public Aluno setCr(double cr) {
		this.cr = cr;
		return this;
	}
	
}

