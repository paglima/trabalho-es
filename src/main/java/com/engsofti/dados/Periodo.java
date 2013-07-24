package com.engsofti.dados;

public class Periodo {
	
	private int ano;
	
	private int semestre;
	
	public Periodo(){
		
	}
	
	public Periodo(String anoSemestre){
		this.ano 	  = Integer.parseInt(anoSemestre.substring(0,4));
		this.semestre = Integer.parseInt(anoSemestre.substring(5,6));
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