package com.engsofti.dados;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String nome;
	
	private int cargaHorariaObrigatoria;
	
	private int cargaHorariaOptativa;
	
	private int cargaHorariaComplementar;
	
	private int cargaHorariaTotal;
	
	public Curso(){
		
	}
	
	public Curso(String nome, int ch_ob, int ch_opt, int ch_comp){
		this.nome 						= nome;
		this.cargaHorariaObrigatoria	= ch_ob;
		this.cargaHorariaOptativa		= ch_opt;
		this.cargaHorariaComplementar	= ch_comp;
		this.cargaHorariaTotal			= getCargaHorariaTotal();
	}
	
	public double calculaCrPorPeriodo(List<Disciplina> disciplinasAluno, String periodo){
		return calculaCr(getDisciplinasGroupByPeriodo(disciplinasAluno, periodo));
	}
	
	public double calculaCr(List<Disciplina> disciplinasAluno){
		int somaMediaVezesCh = 0;
		double somaCh    	 = 0;
		for (Disciplina disciplina : disciplinasAluno) {
			somaMediaVezesCh += (disciplina.getMedia() * disciplina.getCargaHoraria());
			somaCh			 += disciplina.getCargaHoraria(); 				
		}
		
		return somaMediaVezesCh/somaCh;
	}
	
	private List<Disciplina> getDisciplinasGroupByPeriodo(List<Disciplina> disciplinasAluno, String periodo){
		List<Disciplina> aux = new ArrayList<Disciplina>();
		for (Disciplina disciplina : disciplinasAluno) {
			if(disciplina.getPeriodo().toString().equals(periodo)){
					aux.add(disciplina);			
			}
		}
		return aux;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHorariaObrigatoria() {
		return cargaHorariaObrigatoria;
	}

	public void setCargaHorariaObrigatoria(int cargaHorariaObrigatoria) {
		this.cargaHorariaObrigatoria = cargaHorariaObrigatoria;
	}

	public int getCargaHorariaOptativa() {
		return cargaHorariaOptativa;
	}

	public void setCargaHorariaOptativa(int cargaHorariaOptativa) {
		this.cargaHorariaOptativa = cargaHorariaOptativa;
	}

	public int getCargaHorariaComplementar() {
		return cargaHorariaComplementar;
	}

	public void setCargaHorariaComplementar(int cargaHorariaComplementar) {
		this.cargaHorariaComplementar = cargaHorariaComplementar;
	}

	public int getCargaHorariaTotal() {
		return cargaHorariaObrigatoria + cargaHorariaOptativa + cargaHorariaComplementar;
	}

}