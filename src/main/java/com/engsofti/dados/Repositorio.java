package com.engsofti.dados;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Repositorio {

	
	private Map<String,Aluno> alunos;
	
	private static Repositorio instance;		
	
	public static Repositorio getInstance() {
		if (instance == null) {
			instance = new Repositorio();
		}
		
		return instance;
	}
	
	public Repositorio(){
		alunos		= new HashMap<String,Aluno>();
		Aluno paulo = new Aluno().setMatricula("21031131").setNome("Paulo").setSenha("123").setEmail("pauloarthur@id.uff.br");
		paulo.getDisciplinas().add(new Disciplina("ES","Viviane").setPeriodo(new Periodo("2013.1")));
		paulo.getDisciplinas().get(0).getAtividades().add(new Prova("24/07/2013 03:10:00",10.0,2,"Design Pattern"));
		paulo.getDisciplinas().add(new Disciplina("ED2","Viterbo").setPeriodo(new Periodo("2013.1")));
		alunos.put("21031131", paulo);
	}

	public Map<String,Aluno> getAlunos() {
		return alunos;
	}
	
	public void salvaOuAtualiza(Aluno aluno) {
		alunos.put(aluno.getMatricula(),aluno);
	}
	
	public List<Disciplina> listaDisciplinas(String matricula) {
		return alunos.get(matricula).getDisciplinas();
	}
	
	public Aluno encontraAluno(String matricula) {
		return alunos.get(matricula);
	}
	
}