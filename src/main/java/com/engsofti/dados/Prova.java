package com.engsofti.dados;

import org.springframework.stereotype.Component;

@Component
public class Prova extends Atividade{

	
	public Prova(){
		
	}
	
	public Prova(String data,Double nota,Integer peso,String conteudo){
		super.setData(data);
		super.setNota(nota);
		super.setPeso(peso);
		super.setConteudo(conteudo);
	}

	@Override
	public String toString() {
		return super.getData()+" - "+super.getNota()+" - "+super.getPeso()+"";
	}
	
	
}