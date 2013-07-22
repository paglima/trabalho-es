package com.engsofti.dados;

public class Periodo {
	
	private int ano;
	
	private int semestre;
	
	public Periodo(){
		
	}
	
	public Periodo(int ano, int semestre){
		this.ano 	  = ano;
		this.semestre = semestre;
	}

	public int getAno() {
		return ano;
	}

	public Periodo setAno(int ano) {
		this.ano = ano;
		return this;
	}

	public int getSemestre() {
		return semestre;
	}

	public Periodo setSemestre(int semestre) throws Exception {
		if(semestre == 1 || semestre == 2){
			this.semestre = semestre;
			return this;
		}
		throw new Exception("Numero do semestre inserido invalido");
	}
	
	public String toString(){
		return ano+"."+semestre;
	}

}